package com.portfolio.data.servicio;

import com.portfolio.data.modelo.usuario;

import java.util.List;

public interface IUsuariosService {
    List<usuario> verUsuarios();
    void crearUsuarios(usuario usuario);
    void  eliminarUsuarios(Integer id);
}
