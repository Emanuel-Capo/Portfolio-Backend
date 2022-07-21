package com.portfolio.data.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="educacion")
@Getter @Setter
public class educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "academia")
    private String academia;
    @Column(name = "fecha_fin")
    private Date fecha_fin;

    public educacion() {
    }

    public educacion(Integer id, String titulo, String academia, Date fecha_fin) {
        this.id = id;
        this.titulo = titulo;
        this.academia = academia;
        this.fecha_fin = fecha_fin;
    }
}
