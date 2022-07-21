package com.portfolio.data.servicio;

import com.portfolio.data.modelo.experiencia;

import java.util.List;

public interface IExperienciaService {

    List<experiencia> verExperiencia();
    void crearExperiencia(experiencia exp);
    void  eliminarExperiencia(Integer id);
    experiencia encontrarExperiencia(Integer id);

}
