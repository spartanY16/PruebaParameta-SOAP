//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.09.21 a las 04:29:23 PM COT 
//


package com.parameta_soap_service.parameta.soap.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDeNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDeVinculacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombres",
    "apellidos",
    "tipoDeDocumento",
    "numeroDeDocumento",
    "fechaDeNacimiento",
    "fechaDeVinculacion",
    "cargo",
    "salario"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String nombres;
    @XmlElement(required = true)
    protected String apellidos;
    @XmlElement(required = true)
    protected String tipoDeDocumento;
    @XmlElement(required = true)
    protected String numeroDeDocumento;
    @XmlElement(required = true)
    protected String fechaDeNacimiento;
    @XmlElement(required = true)
    protected String fechaDeVinculacion;
    @XmlElement(required = true)
    protected String cargo;
    protected double salario;

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeDocumento(String value) {
        this.tipoDeDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeDocumento(String value) {
        this.numeroDeDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaDeNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeNacimiento(String value) {
        this.fechaDeNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDeVinculacion() {
        return fechaDeVinculacion;
    }

    /**
     * Define el valor de la propiedad fechaDeVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDeVinculacion(String value) {
        this.fechaDeVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad salario.
     * 
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define el valor de la propiedad salario.
     * 
     */
    public void setSalario(double value) {
        this.salario = value;
    }

}
