package com.example.backendjavacuidarteperu.models;

import jakarta.persistence.*;

@Entity
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_detalle_venta;

    @Basic
    private Float precio;

    private Integer cantidad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_venta_id_venta")
    private Venta venta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_venta_id_medicamento")
    private Medicamento medicamento;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id_detalle_venta, Float precio, Integer cantidad, Venta venta, Medicamento medicamento) {
        this.id_detalle_venta = id_detalle_venta;
        this.precio = precio;
        this.cantidad = cantidad;
        this.venta = venta;
        this.medicamento = medicamento;
    }

    public Integer getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(Integer id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
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

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
