package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.Empleado;
import com.example.backendjavacuidarteperu.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping()
    public ArrayList<Empleado> findAll() {
        return this.empleadoService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Empleado> findOne(@PathVariable("id") Integer id) {
        return this.empleadoService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public Empleado create(@RequestBody Empleado empleado) {
        return this.empleadoService.create(empleado);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.empleadoService.destroy(id);
    }

}
