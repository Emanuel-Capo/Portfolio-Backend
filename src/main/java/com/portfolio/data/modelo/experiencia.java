package com.portfolio.data.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="experiencia")
@Getter @Setter
public class experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "trabajo")
    private String trabajo;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "fecha_inicio")
    private Date fecha_inicio;
    @Column(name = "fecha_fin")
    private Date fecha_fin;
    @Column(name = "descripcion")
    private String descripcion;

    public experiencia() {
    }

    public experiencia(Integer id, String trabajo, String empresa, Date fecha_inicio, Date fecha_fin, String descripcion) {
        this.id = id;
        this.trabajo = trabajo;
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }
}
