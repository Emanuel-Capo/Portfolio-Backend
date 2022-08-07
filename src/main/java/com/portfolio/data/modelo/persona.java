package com.portfolio.data.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="persona")
@Getter @Setter
public class persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name= "acerca")
    private String acerca;
    @Column(name= "img")
    private String img;

    public persona() {
    }

    public persona(int id, String acerca, String img) {
        this.id = id;
        this.acerca = acerca;
        this.img = img;
    }
}
