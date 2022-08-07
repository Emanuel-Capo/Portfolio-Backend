package com.portfolio.data.repositorio;

import com.portfolio.data.modelo.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepositorio extends JpaRepository<persona, Integer> {
}
