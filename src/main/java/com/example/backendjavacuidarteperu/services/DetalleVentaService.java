package com.example.backendjavacuidarteperu.services;


import com.example.backendjavacuidarteperu.models.DetalleVenta;
import com.example.backendjavacuidarteperu.repositories.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    DetalleVentaRepository detalleVentaRepository;

    public ArrayList<DetalleVenta> findAll() {
        return (ArrayList<DetalleVenta>) detalleVentaRepository.findAll();
    }

    public DetalleVenta create(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    public Optional<DetalleVenta> findOne(Integer id) {
        return detalleVentaRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            detalleVentaRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

}
