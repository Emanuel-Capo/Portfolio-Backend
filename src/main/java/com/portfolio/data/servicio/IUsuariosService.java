package com.portfolio.data.servicio;

import com.portfolio.data.modelo.usuario;

import java.util.List;

public interface IUsuariosService {
    usuario verUsuario(Integer id);
    boolean validarUsuario(usuario enviado, usuario usuarioDB);
}
