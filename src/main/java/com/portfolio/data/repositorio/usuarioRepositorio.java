package com.portfolio.data.repositorio;

import com.portfolio.data.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepositorio extends JpaRepository<usuario,Integer> {
}
