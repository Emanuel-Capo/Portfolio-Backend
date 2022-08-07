package com.portfolio.data.modelo;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
@Getter @Setter
public class usuario {

    @Id
    private Integer id;
    private String nombre;
    private String password;

    public usuario() {
    }

    public usuario(Integer id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }
}
