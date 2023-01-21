package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.Proveedor;
import com.example.backendjavacuidarteperu.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    @Autowired
    ProveedorService proveedorService;

    @GetMapping()
    public ArrayList<Proveedor> findAll() {
        return this.proveedorService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Proveedor> findOne(@PathVariable("id") Integer id) {
        return this.proveedorService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public Proveedor create(@RequestBody Proveedor proveedor) {
        return this.proveedorService.create(proveedor);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.proveedorService.destroy(id);
    }
}
