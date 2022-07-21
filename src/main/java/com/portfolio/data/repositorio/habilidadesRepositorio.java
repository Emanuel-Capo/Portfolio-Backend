package com.portfolio.data.repositorio;

import com.portfolio.data.modelo.habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface habilidadesRepositorio extends JpaRepository<habilidades,Integer> {
}
