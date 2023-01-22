package com.example.backendjavacuidarteperu.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Deposito {

    @Id
    private Integer id_deposito;


    public Deposito() {
    }

    public Deposito(Integer id_deposito) {
        this.id_deposito = id_deposito;
    }

    public Integer getId_deposito() {
        return id_deposito;
    }

    public void setId_deposito(Integer id) {
        this.id_deposito = id;
    }
}
