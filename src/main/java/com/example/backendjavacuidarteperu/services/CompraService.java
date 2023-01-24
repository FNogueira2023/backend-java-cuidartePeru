package com.example.backendjavacuidarteperu.services;

import com.example.backendjavacuidarteperu.models.Compra;
import com.example.backendjavacuidarteperu.repositories.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class CompraService {
    @Autowired
    CompraRepository compraRepository;

    public ArrayList<Compra> findAll() {
        return (ArrayList<Compra>) compraRepository.findAll();
    }

    public Compra create(Compra compra) {
        return compraRepository.save(compra);
    }

    public Optional<Compra> findOne(Integer id) {
        return compraRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            compraRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

    //    by FECHA
    public ArrayList<Compra> findByFechaBetween(Date primeraFecha, Date segundaFecha) {
        return compraRepository.findByFechaBetween(primeraFecha, segundaFecha);
    }


}
