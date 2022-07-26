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
    private int id;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "academia")
    private String academia;
    @Column(name = "fecha_fin")
    private Date fecha_fin;
    @Column(name = "img")
    private String img;

    public educacion() {
    }

    public educacion(int id, String titulo, String academia, Date fecha_fin, String img) {
        this.id = id;
        this.titulo = titulo;
        this.academia = academia;
        this.fecha_fin = fecha_fin;
        this.img = img;
    }
}
