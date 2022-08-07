package com.portfolio.data.servicio;

import com.portfolio.data.modelo.usuario;
import com.portfolio.data.repositorio.usuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuariosService implements IUsuariosService{

    @Autowired
    public usuarioRepositorio usuarioRepo;

    @Override
    public usuario verUsuario(Integer id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public boolean validarUsuario(usuario enviado, usuario usuarioDB){
        return Objects.equals(enviado.getNombre(), usuarioDB.getNombre()) & Objects.equals(enviado.getPassword(), usuarioDB.getPassword());

    }

}
