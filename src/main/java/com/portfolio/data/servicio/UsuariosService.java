package com.portfolio.data.servicio;

import com.portfolio.data.modelo.usuario;
import com.portfolio.data.repositorio.usuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService implements IUsuariosService{

    @Autowired
    public usuarioRepositorio usuarioRepo;

    @Override
    public List<usuario> verUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public void crearUsuarios(usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void eliminarUsuarios(Integer id) {
        usuarioRepo.deleteById(id);
    }

}
