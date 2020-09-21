package com.parameta.soap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parameta.soap.entity.Empleado;
import com.parameta.soap.manager.CustomerRequest;
import com.parameta.soap.manager.Response;
import com.parameta.soap.repository.EmpleadoRepository;

@Service
public class GestionarEmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public Response guardarEmpleado(CustomerRequest empleadoSolicitado) {

		Empleado empleado = new Empleado(empleadoSolicitado.getNombres(), empleadoSolicitado.getApellidos(),
				empleadoSolicitado.getTipoDeDocumento(), empleadoSolicitado.getNumeroDeDocumento(),
				empleadoSolicitado.getFechaDeNacimiento(), empleadoSolicitado.getSalario());

		Response resultado = new Response();

		try {

			empleadoRepository.save(empleado);
			resultado.setConsumoExitoso(true);

		} catch (Exception e) {

			resultado.setConsumoExitoso(false);

		}

		return resultado;

	}

}
