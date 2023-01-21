package com.example.backendjavacuidarteperu.models;

import jakarta.persistence.*;

@Entity
public class InventarioDeposito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_inventario_deposito;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_deposito")
    private Deposito deposito;

    @OneToOne
    @JoinColumn(name = "inventario_id_medicamento")
    private Medicamento medicamento;

    @Basic
    private Integer stock;

    public InventarioDeposito() {
    }

    public InventarioDeposito(Integer id_inventario_deposito, Deposito deposito, Medicamento medicamento, Integer stock) {
        this.id_inventario_deposito = id_inventario_deposito;
        this.deposito = deposito;
        this.medicamento = medicamento;
        this.stock = stock;
    }

    public Integer getId_inventario_deposito() {
        return id_inventario_deposito;
    }

    public void setId_inventario_deposito(Integer id_inventario_deposito) {
        this.id_inventario_deposito = id_inventario_deposito;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
