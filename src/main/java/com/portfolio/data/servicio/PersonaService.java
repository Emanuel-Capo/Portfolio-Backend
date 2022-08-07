package com.portfolio.data.servicio;

import com.portfolio.data.modelo.persona;
import com.portfolio.data.repositorio.personaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private personaRepositorio persoRepo;

    @Override
    public persona verPersona(int id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void crearPersona(persona per) {
        persoRepo.save(per);
    }
}
