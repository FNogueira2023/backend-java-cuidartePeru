package com.example.backendjavacuidarteperu.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_compra;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA")
    private Date fecha;


    @Column(name = "TOTAL_COMPRA")
    private Float total_compra;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @JsonManagedReference
    @OneToMany(mappedBy = "compra")
    private List<DetalleCompra> detalleCompras;

    public Compra() {
    }

    public Compra(Integer id_compra, Date fecha, Proveedor proveedor, Empleado empleado, List<DetalleCompra> detalleCompras) {
        this.id_compra = id_compra;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.empleado = empleado;
        this.detalleCompras = detalleCompras;
    }

    public Integer getId_compra() {
        return id_compra;
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<DetalleCompra> getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(List<DetalleCompra> detalleCompras) {
        this.detalleCompras = detalleCompras;
    }
}
