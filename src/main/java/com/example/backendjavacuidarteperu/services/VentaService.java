package com.example.backendjavacuidarteperu.services;


import com.example.backendjavacuidarteperu.models.Venta;
import com.example.backendjavacuidarteperu.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    public ArrayList<Venta> findAll() {
        return (ArrayList<Venta>) ventaRepository.findAll();
    }

    public Venta create(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Optional<Venta> findOne(Integer id) {
        return ventaRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            ventaRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

}
