package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.Compra;
import com.example.backendjavacuidarteperu.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    CompraService compraService;

    @GetMapping()
    public ArrayList<Compra> findAll() {
        return this.compraService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Compra> findOne(@PathVariable("id") Integer id) {
        return this.compraService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public Compra create(@RequestBody Compra compra) {
        return this.compraService.create(compra);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.compraService.destroy(id);
    }

//    by FECHA
    @GetMapping(path = "/busquedaPorFechas", consumes = {"application/json"})
    public ArrayList<Compra> findByFechaBetween(@RequestBody Date primeraFecha, Date segundaFecha) {
        return this.compraService.findByFechaBetween(primeraFecha, segundaFecha);
    }
}
