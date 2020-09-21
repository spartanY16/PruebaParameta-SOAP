package com.parameta.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.parameta.soap.manager.CustomerRequest;
import com.parameta.soap.manager.Response;
import com.parameta.soap.service.GestionarEmpleadoService;

@Endpoint
public class GestionarEmpleadoEndpoint {
	
	private static final String NAMESPACE = "http://www.parameta-soap-service.com/parameta/soap/manager";
	
	@Autowired
	private GestionarEmpleadoService gestionarEmpleadoService;

	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public Response getLoanStatus(@RequestPayload CustomerRequest empleadoSolicitado) {
		
		return gestionarEmpleadoService.guardarEmpleado(empleadoSolicitado);
		
	}

}
