package com.babel.scoringJavi.repositories;


import com.babel.scoringJavi.models.Persona;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
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
private Date fechaScorig;
private List<TelefonoContacto> telefonos;

direccion -- persona -- telefono
*/

/*
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
 */

@Mapper
public interface ScoringRepositoryMyBatis {

    @Insert("INSERT INTO SCORING.DIRECCION(DIRECCION_ID, TIPO_VIA_ID, NOMBRE_CALLE, NUM, PISO, PUERTA, ESCALERA, OTRO_DATO, COD_POSTAL," +
            " MUNICIPIO, COD_PROVINCIA) VALUES(#{Direccion.DIRECCION_ID}, #{Direccion.TIPO_VIA_ID}, #{Direccion.NOMBRE_CALLE}, #{Direccion.NUM}" +
            "Direccion.PISO}, #{Direccion.PUERTA}, #{Direccion.ESCALERA}, #{Direccion.OTRO_DATO}, #{Direccion.COD_POSTAL}, #{Direccion.MUNICIPIO}, #{Direccion.COD_PROVINCIA})")


    @Insert("INSERT INTO SCORING.PERSONA(personaID, nombre, apellido_1, apellido_2, direccionDomicilio, direccionNotificacion, nif, fechaNacimiento, nacionalidad, scoring, fechaScorig, telefonos) " +
            "VALUES(#{Persona.personaID}, #{Persona.nombre}, #{Persona.apellido_1}, #{Persona.apellido_2}, #{Persona.direccionDomicilio}, #{Persona.direccionNotificacion}, #{Persona.nif}, #{Persona.fechaNacimiento}, " +
            "#{Persona.nacionalidad}, #{Persona.scoring}, #{Persona.fechaScoring}, #{Persona.telefonos})")

    @Insert("INSERT INTO SCORING.TELEFONO_CONTACTO(TELEFONO_ID, PERSONA_ID, TELEFONO) VALUES(#{TelefonoContacto.personaID}, #{TelefonoContacto.nombre}, #{TelefonoContacto.director})")

    @Results(value = {
            @Result(property = "personaID", column = "PERSONA_ID"),
            @Result(property = "nombre", column = "NOMBRE"),
            @Result(property = "apellido_1", column = "APELLIDO1"),
            @Result(property = "apellido_2", column = "APELLIDO2"),
            @Result(property = "direccionDomicilio", column = "DIRECCION_DOMICILIO_ID"),
            @Result(property = "direccionNotificacion", column = "DIRECCION_NOTIFICACION_ID"),
            @Result(property = "nif", column = "NIF"),
            @Result(property = "fechaNacimiento", column = "FECHA_NACIMIENTO"),
            @Result(property = "nacionalidad", column = "NACIONALIDAD"),
            @Result(property = "scoring", column = "direccion"),
            @Result(property = "fechaScoring", column = "direccion"),
            @Result(property = "telefonos", column = "direccion")
    })
    public void alta(Persona persona);


    @Select("SELECT id, nombre, director, direccion from sucursal")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "nombre", column = "nombre"),
            @Result(property = "director", column = "director"),
            @Result(property = "direccion", column = "direccion")

    })
    public List<Persona> listar();

    @Delete("DELETE FROM sucursal WHERE id=#{sucursal.id}")
    public void borrar(Persona persona);


    @Update("Update SUCURSAL SET #{sucursalvieja.id}= #{sucursalnueva.id}, " +
            "#{sucursalvieja.nombre}= #{sucursalnueva.nombre}," +
            "#{sucursalvieja.director}= #{sucursalnueva.director}," +
            "#{sucursalvieja.direccion}= #{sucursalnueva.direccion} " +
            "from SUCURSAL where id = #{sucursalvieja}")
    public void modificar(Persona persona);
}
