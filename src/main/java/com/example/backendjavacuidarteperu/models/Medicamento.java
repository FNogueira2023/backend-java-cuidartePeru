package com.example.backendjavacuidarteperu.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Basic
    private String nombre;
    private Date fecha_registrado;
    private Date fecha_vencimiento;
    private String descripcion;
    private String imagen;
    private String categoria;
    private String Laboratorio;

    @OneToOne(mappedBy = "medicamento")
    private InventarioDeposito inventarioDeposito;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nombre, Date fecha_registrado, Date fecha_vencimiento, String descripcion, String imagen, String categoria, String laboratorio, InventarioDeposito inventarioDeposito) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_registrado = fecha_registrado;
        this.fecha_vencimiento = fecha_vencimiento;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.categoria = categoria;
        Laboratorio = laboratorio;
        this.inventarioDeposito = inventarioDeposito;
    }


    public InventarioDeposito getInventarioDeposito() {
        return inventarioDeposito;
    }

    public void setInventarioDeposito(InventarioDeposito inventarioDeposito) {
        this.inventarioDeposito = inventarioDeposito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_registrado() {
        return fecha_registrado;
    }

    public void setFecha_registrado(Date fecha_registrado) {
        this.fecha_registrado = fecha_registrado;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        Laboratorio = laboratorio;
    }
}
