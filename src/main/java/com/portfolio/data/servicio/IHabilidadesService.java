package com.portfolio.data.servicio;

import com.portfolio.data.modelo.habilidades;

import java.util.List;

public interface IHabilidadesService {
    List<habilidades> verHabilidades();
    void crearHabilidades(habilidades hab);
    void  eliminarHabilidades(Integer id);
    habilidades encontrarHabilidades(Integer id);
}
