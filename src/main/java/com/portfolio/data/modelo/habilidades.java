package com.portfolio.data.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="habilidades")
@Getter @Setter
public class habilidades {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "habilidad")
    private String habilidad;
    @Column(name = "porcentaje")
    private Integer porcentaje;

    public habilidades() {
    }

    public habilidades(Integer id, String habilidad, Integer porcentaje) {
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }
}
