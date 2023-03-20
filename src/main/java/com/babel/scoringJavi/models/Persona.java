package com.babel.scoringJavi.models;

import java.util.Date;
import java.util.List;

public class Persona {
    private Integer personaID;
    private String nombre;
    private String apellido_1;
    private String apellido_2;
    private Direccion direccionDomicilio;
    private Direccion direccionNotificacion;
    private String nif;
    private Date fechaNacimiento;
    private Pais nacionalidad;
    private Integer scoring;
    private Date fechaScoring;
    private List<TelefonoContacto> telefonos;

    public Persona(Integer personaID, String nombre, String apellido_1, String apellido_2, Direccion direccionDomicilioID, Direccion direccionNotificacionID, String nif, Date fechaNacimiento, Pais nacionalidad, Integer scoring, Date fechaScoring, List<TelefonoContacto> telefonos) {
        this.personaID = personaID;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        this.direccionDomicilio = direccionDomicilioID;
        this.direccionNotificacion = direccionNotificacionID;
        this.nif = nif;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.scoring = scoring;
        this.fechaScoring = fechaScoring;
        this.telefonos = telefonos;
    }

    public Integer getPersonaID() {
        return personaID;
    }

    public void setPersonaID(Integer personaID) {
        this.personaID = personaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public Direccion getDireccionDomicilioID() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilioID(Direccion direccionDomicilioID) {
        this.direccionDomicilio = direccionDomicilioID;
    }

    public Direccion getDireccionNotificacionID() {
        return direccionNotificacion;
    }

    public void setDireccionNotificacionID(Direccion direccionNotificacionID) {
        this.direccionNotificacion = direccionNotificacionID;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getScoring() {
        return scoring;
    }

    public void setScoring(Integer scoring) {
        this.scoring = scoring;
    }

    public Date getFechaScorig() {
        return fechaScoring;
    }

    public void setFechaScorig(Date fechaScorig) {
        this.fechaScoring = fechaScorig;
    }

    public List<TelefonoContacto> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<TelefonoContacto> telefonos) {
        this.telefonos = telefonos;
    }
}
