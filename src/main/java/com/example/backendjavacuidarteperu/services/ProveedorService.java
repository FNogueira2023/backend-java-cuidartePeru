package com.example.backendjavacuidarteperu.services;


import com.example.backendjavacuidarteperu.models.Proveedor;
import com.example.backendjavacuidarteperu.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProveedorService {

    @Autowired
    ProveedorRepository proveedorRepository;

    public ArrayList<Proveedor> findAll() {
        return (ArrayList<Proveedor>) proveedorRepository.findAll();
    }

    public Proveedor create(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Optional<Proveedor> findOne(Integer id) {
        return proveedorRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            proveedorRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }
}
