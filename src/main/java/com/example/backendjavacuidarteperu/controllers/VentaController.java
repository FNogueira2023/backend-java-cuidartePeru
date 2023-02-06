package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.Venta;
import com.example.backendjavacuidarteperu.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @GetMapping()
    @ResponseBody
    public ArrayList<Venta> findAll() {
        return this.ventaService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<Venta> findOne(@PathVariable("id") Integer id) {
        return this.ventaService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public Venta create(@RequestBody Venta venta) {
        return this.ventaService.create(venta);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.ventaService.destroy(id);
    }
}
