package com.portfolio.data.servicio;

import com.portfolio.data.modelo.educacion;

import java.util.List;

public interface IEducacionService {
    List<educacion> verEducacion();
    void crearEducacion(educacion edu);
    void  eliminarEducacion(Integer id);
    educacion encontrarEducacion(Integer id);
}
