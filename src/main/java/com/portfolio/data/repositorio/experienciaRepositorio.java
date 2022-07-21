package com.portfolio.data.repositorio;

import com.portfolio.data.modelo.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepositorio extends JpaRepository<experiencia,Integer> {
}
