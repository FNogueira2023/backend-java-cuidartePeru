package com.example.backendjavacuidarteperu.services;


import com.example.backendjavacuidarteperu.models.Empleado;
import com.example.backendjavacuidarteperu.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<Empleado> findAll() {
        return (ArrayList<Empleado>) empleadoRepository.findAll();
    }

    public Empleado create(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Optional<Empleado> findOne(Integer id) {
        return empleadoRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            empleadoRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

}
