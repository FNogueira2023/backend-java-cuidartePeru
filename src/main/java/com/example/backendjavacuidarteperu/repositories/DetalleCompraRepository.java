package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.DetalleCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DetalleCompraRepository extends CrudRepository<DetalleCompra, Integer> {

    public abstract ArrayList<DetalleCompra> findByPrecioIsGreaterThan(Integer precio);

    public abstract ArrayList<DetalleCompra> findByPrecioIsLessThan(Integer precio);

}
