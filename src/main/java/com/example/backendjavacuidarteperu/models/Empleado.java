package com.example.backendjavacuidarteperu.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_empleado;

    @Basic
    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private String password;

    @JsonManagedReference
    @OneToMany(mappedBy = "empleado")
    private List<Compra> compras;

    @JsonManagedReference
    @OneToMany(mappedBy = "empleado")
    private List<Venta> ventas;

    public Empleado() {
    }


    public Empleado(Integer id_empleado, String nombre, String apellido, String celular, String email, String password, List<Compra> compras, List<Venta> ventas) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.password = password;
        this.compras = compras;
        this.ventas = ventas;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }


    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id) {
        this.id_empleado = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
