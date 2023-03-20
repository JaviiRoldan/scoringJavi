package com.babel.scoringJavi.service;

import com.babel.scoringJavi.models.Persona;

import java.util.List;

public interface ScoringService{
    public void altaPersona(Persona persona);

    public List<Persona> listarPersonas();

    public void borrarPersona(Persona persona);

    public void modificarPersona(Integer id, Persona persona);
}
