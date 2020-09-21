package com.parameta.soap.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {

	private static final long serialVersionUID = -4396458815504900605L;

	public Empleado() {

	}

	public Empleado(String nombres, String apellidos, String tipoDocumento, String numeroDocumento, String cargo,
			Double salario) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Column(name = "NOMBRES")
	private String nombres;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "TIPO_DOCUEMTTO")
	private String tipoDocumento;

	@Id
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Column(name = "FECHA_NACIMIENTO")
	private LocalDate fechaNacimiento;

	@Column(name = "FECHA_VINCULACION_COMPANIA")
	private LocalDate fechaVinculacionCompania;

	@Column(name = "CARGO")
	private String cargo;

	@Column(name = "SALARIO")
	private Double salario;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaVinculacionCompania() {
		return fechaVinculacionCompania;
	}

	public void setFechaVinculacionCompania(LocalDate fechaVinculacionCompania) {
		this.fechaVinculacionCompania = fechaVinculacionCompania;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
