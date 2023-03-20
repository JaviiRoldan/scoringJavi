package com.babel.scoringJavi.models;

public class Direccion {
    private Integer direccionID;
    private TipoVia tipoViaID;
    private String nombreCalle;
    private String num;
    private String piso;
    private String puerta;
    private String escalera;
    private String otroDato;
    private String codigoPostal;
    private String municipio;
    private Provincia codProvincia;


    public Direccion(Integer direccionID, TipoVia tipoViaID, String nombreCalle, String num, String piso, String puerta, String escalera, String otroDato, String codigoPostal, String municipio, Provincia codProvincia) {
        this.direccionID = direccionID;
        this.tipoViaID = tipoViaID;
        this.nombreCalle = nombreCalle;
        this.num = num;
        this.piso = piso;
        this.puerta = puerta;
        this.escalera = escalera;
        this.otroDato = otroDato;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.codProvincia = codProvincia;
    }

    public Integer getDireccionID() {
        return direccionID;
    }

    public void setDireccionID(Integer direccionID) {
        this.direccionID = direccionID;
    }

    public TipoVia getTipoViaID() {
        return tipoViaID;
    }

    public void setTipoViaID(TipoVia tipoViaID) {
        this.tipoViaID = tipoViaID;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(String otroDato) {
        this.otroDato = otroDato;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Provincia getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(Provincia codProvincia) {
        this.codProvincia = codProvincia;
    }
}
