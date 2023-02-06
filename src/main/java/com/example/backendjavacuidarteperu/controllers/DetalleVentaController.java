package com.example.backendjavacuidarteperu.controllers;


import com.example.backendjavacuidarteperu.models.DetalleVenta;
import com.example.backendjavacuidarteperu.services.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/detalleVentas")
public class DetalleVentaController {

    @Autowired
    DetalleVentaService detalleVentaService;

    @GetMapping()
    @ResponseBody
    public ArrayList<DetalleVenta> findAll() {
        return this.detalleVentaService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<DetalleVenta> findOne(@PathVariable("id") Integer id) {
        return this.detalleVentaService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public DetalleVenta create(@RequestBody DetalleVenta detalleVenta) {
        return this.detalleVentaService.create(detalleVenta);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.detalleVentaService.destroy(id);
    }

}
