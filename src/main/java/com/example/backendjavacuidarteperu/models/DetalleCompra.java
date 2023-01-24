package com.example.backendjavacuidarteperu.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_detalle_compra;

    @Basic
    private Float precio;

    private Integer cantidad;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_id_compra")
    private Compra compra;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_id_medicamento")
    private Medicamento medicamento;


    public DetalleCompra() {
    }

    public DetalleCompra(Integer id_detalle_compra, Float precio, Integer cantidad, Compra compra, Medicamento medicamento) {
        this.id_detalle_compra = id_detalle_compra;
        this.precio = precio;
        this.cantidad = cantidad;
        this.compra = compra;
        this.medicamento = medicamento;
    }

    public Integer getId_detalle_compra() {
        return id_detalle_compra;
    }

    public void setId_detalle_compra(Integer id_detalle_compra) {
        this.id_detalle_compra = id_detalle_compra;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
