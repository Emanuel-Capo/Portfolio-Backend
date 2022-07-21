package com.portfolio.data.repositorio;

import com.portfolio.data.modelo.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepositorio extends JpaRepository<educacion, Integer> {
}
