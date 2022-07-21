package com.portfolio.data.servicio;

import com.portfolio.data.modelo.proyectos;
import com.portfolio.data.repositorio.proyectosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectosService implements IProyectosService{

    @Autowired
    private proyectosRepositorio proyRepo;

    @Override
    public List<proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyectos(proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void eliminarProyectos(Integer id) {
        proyRepo.deleteById(id);
    }

    @Override
    public proyectos encontrarProyectos(Integer id) {
        return proyRepo.findById(id).orElse(null);
    }
}
