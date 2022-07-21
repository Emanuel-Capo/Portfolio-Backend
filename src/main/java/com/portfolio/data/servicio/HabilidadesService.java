package com.portfolio.data.servicio;

import com.portfolio.data.modelo.habilidades;
import com.portfolio.data.repositorio.habilidadesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadesService implements IHabilidadesService{
    @Autowired
    private habilidadesRepositorio habilRepo;

    @Override
    public List<habilidades> verHabilidades() {
        return habilRepo.findAll();
    }

    @Override
    public void crearHabilidades(habilidades hab) {
        habilRepo.save(hab);
    }

    @Override
    public void eliminarHabilidades(Integer id) {
        habilRepo.deleteById(id);
    }

    @Override
    public habilidades encontrarHabilidades(Integer id) {
        return habilRepo.findById(id).orElse(null);
    }
}
