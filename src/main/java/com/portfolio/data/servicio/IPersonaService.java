package com.portfolio.data.servicio;

import com.portfolio.data.modelo.persona;


public interface IPersonaService {
    persona verPersona(int id);
    void crearPersona(persona per);

}
