package com.example.backendjavacuidarteperu.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
    private String descripcion;
    private String imagen;
    private String categoria;
    private String Laboratorio;

//    ERROR : More than one row with the given identifier was found: 14;
//    @OneToOne(mappedBy = "medicamento", cascade = CascadeType.ALL, orphanRemoval = true)
//    private InventarioDeposito inventarioDeposito;

    @JsonManagedReference
    @OneToMany(mappedBy = "medicamento")
    private List<DetalleCompra> detalleCompras;

    @JsonManagedReference
    @OneToMany(mappedBy = "medicamento")
    private List<DetalleVenta> detalleVentas;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nombre, Date fecha_registrado, String descripcion, String imagen, String categoria, String laboratorio, InventarioDeposito inventarioDeposito, List<DetalleCompra> detalleCompras, List<DetalleVenta> detalleVentas) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_registrado = fecha_registrado;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.categoria = categoria;
        Laboratorio = laboratorio;
//        this.inventarioDeposito = inventarioDeposito;
        this.detalleCompras = detalleCompras;
        this.detalleVentas = detalleVentas;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

//    public InventarioDeposito getInventarioDeposito() {
//        return inventarioDeposito;
//    }
//
//    public void setInventarioDeposito(InventarioDeposito inventarioDeposito) {
//        this.inventarioDeposito = inventarioDeposito;
//    }

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

    public List<DetalleCompra> getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(List<DetalleCompra> detalleCompras) {
        this.detalleCompras = detalleCompras;
    }
}
