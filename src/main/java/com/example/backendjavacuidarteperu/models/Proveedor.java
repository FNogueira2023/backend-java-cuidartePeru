package com.example.backendjavacuidarteperu.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_proveedor;

    @Basic
    private String nombre;
    private String apellido;
    private String celular;

    @OneToMany(mappedBy = "proveedor")
    private List<Compra> compras;

    public Proveedor() {
    }

    public Proveedor(Integer id_proveedor, String nombre, String apellido, String celular, ArrayList<Compra> compras) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.compras = compras;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id) {
        this.id_proveedor = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
