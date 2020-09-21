package com.parameta.soap.enums;

public enum Constantes {

	NAMESPACE("http://www.parameta-soap-service.com/parameta/soap/manager"), PORT_TYPE_NAME("GestionarEmpleado"),
	LOCATION_URY("/ws"), BEAN_CONFIGURATION_NAME("manager"), XSD_NAME("manager.xsd"), ALL("/*");

	private String descripcion;

	Constantes(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;

	}

}
