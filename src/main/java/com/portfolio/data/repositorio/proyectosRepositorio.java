package com.portfolio.data.repositorio;

import com.portfolio.data.modelo.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepositorio extends JpaRepository<proyectos,Integer> {
}
