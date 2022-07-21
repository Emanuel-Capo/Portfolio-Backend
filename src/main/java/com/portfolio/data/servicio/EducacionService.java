package com.portfolio.data.servicio;

import com.portfolio.data.modelo.educacion;
import com.portfolio.data.repositorio.educacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    private educacionRepositorio eduRepo;

    @Override
    public List<educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void eliminarEducacion(Integer id) {
        eduRepo.deleteById(id);
    }

    @Override
    public educacion encontrarEducacion(Integer id) {
        return eduRepo.findById(id).orElse(null);
    }
}
