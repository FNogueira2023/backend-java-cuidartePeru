package com.example.backendjavacuidarteperu.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Deposito {

    @Id
    private Integer id;


    public Deposito() {
    }

    public Deposito(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
