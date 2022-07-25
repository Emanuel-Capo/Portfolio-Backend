package com.portfolio.data.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="proyectos")
@Getter @Setter
public class proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name= "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "link")
    private String link;

    @Column(name = "img")
    private String img;

    public proyectos() {
    }

    public proyectos(Integer id, String nombre, String descripcion, String link, String img) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
        this.img = img;
    }
}
