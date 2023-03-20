package com.babel.scoringJavi.service.impl;

import com.babel.scoringJavi.models.Persona;
import com.babel.scoringJavi.repositories.ScoringRepositoryMyBatis;
import com.babel.scoringJavi.service.ScoringService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScoringServiceImpl implements ScoringService{
    private ScoringRepositoryMyBatis scoringRepositoryMyBatis;

    public ScoringServiceImpl(ScoringRepositoryMyBatis scoringRepositoryMyBatis) {
        this.scoringRepositoryMyBatis = scoringRepositoryMyBatis;
    }

    @Transactional
    @Override
    public void altaPersona(Persona persona) {
        //
        //
        scoringRepositoryMyBatis.alta(persona);
        //
    }

    @Override
    public List<Persona> listarPersonas() {
        return scoringRepositoryMyBatis.listar().stream().collect(Collectors.toList());
    }

    @Override
    public void borrarPersona(Persona persona) {
        scoringRepositoryMyBatis.borrar(persona);
    }

    @Override
    public void modificarPersona(Integer id, Persona persona) {
        scoringRepositoryMyBatis.modificar(persona);
    }
}
