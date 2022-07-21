package com.portfolio.data.servicio;

import com.portfolio.data.modelo.experiencia;
import com.portfolio.data.repositorio.experienciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public experienciaRepositorio expeRepo;

    @Override
    public List<experiencia> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencia exp) {
        expeRepo.save(exp);
    }

    @Override
    public void eliminarExperiencia(Integer id) {
        expeRepo.deleteById(id);
    }

    @Override
    public experiencia encontrarExperiencia(Integer id) {
        return expeRepo.findById(id).orElse(null);
    }



}
