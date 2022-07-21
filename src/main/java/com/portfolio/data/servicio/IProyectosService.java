package com.portfolio.data.servicio;

import com.portfolio.data.modelo.proyectos;

import java.util.List;

public interface IProyectosService {
    List<proyectos> verProyectos();
    void crearProyectos(proyectos proy);
    void  eliminarProyectos(Integer id);
    proyectos encontrarProyectos(Integer id);
}
