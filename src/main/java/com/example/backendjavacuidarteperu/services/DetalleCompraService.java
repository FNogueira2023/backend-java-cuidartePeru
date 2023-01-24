package com.example.backendjavacuidarteperu.services;

import com.example.backendjavacuidarteperu.models.DetalleCompra;
import com.example.backendjavacuidarteperu.repositories.DetalleCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetalleCompraService {

    @Autowired
    DetalleCompraRepository detalleCompraRepository;

    public ArrayList<DetalleCompra> findAll() {
        return (ArrayList<DetalleCompra>) detalleCompraRepository.findAll();
    }

    public DetalleCompra create(DetalleCompra detalleCompra) {
        return detalleCompraRepository.save(detalleCompra);
    }

    public Optional<DetalleCompra> findOne(Integer id) {
        return detalleCompraRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            detalleCompraRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

    // by PRECIOS_MAYORES_A
    public ArrayList<DetalleCompra> findByPrecioIsGreaterThan(Integer precio) {
        return this.detalleCompraRepository.findByPrecioIsGreaterThan(precio);
    }


    // by PRECIOS_MENORES_A
    public ArrayList<DetalleCompra> findByStockIsLessThan(Integer precio) {
        return this.detalleCompraRepository.findByPrecioIsLessThan(precio);
    }
}
