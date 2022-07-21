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

    @Column(name= "tipo")
    private String tipo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "link")
    private String link;

    public proyectos() {
    }

    public proyectos(Integer id, String tipo, String descripcion, String link) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.link = link;
    }
}
