package com.parameta.soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.parameta.soap.enums.Constantes;

@Configuration
@EnableWs
public class SoapWSConfig {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet,
				Constantes.LOCATION_URY.getDescripcion() + Constantes.ALL.getDescripcion());
	}

	@Bean(name = "manager")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
		defaultWsdl11Definition.setPortTypeName(Constantes.PORT_TYPE_NAME.getDescripcion());
		defaultWsdl11Definition.setLocationUri(Constantes.LOCATION_URY.getDescripcion());
		defaultWsdl11Definition.setTargetNamespace(Constantes.NAMESPACE.getDescripcion());
		defaultWsdl11Definition.setSchema(schema);
		return defaultWsdl11Definition;

	}

	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource(Constantes.XSD_NAME.getDescripcion()));
	}

}
