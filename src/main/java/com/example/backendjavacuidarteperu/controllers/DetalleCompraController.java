package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.DetalleCompra;
import com.example.backendjavacuidarteperu.services.DetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/detalleCompras")
public class DetalleCompraController {

    @Autowired
    DetalleCompraService detalleCompraService;

    @GetMapping()
    @ResponseBody
    public ArrayList<DetalleCompra> findAll() {
        return this.detalleCompraService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<DetalleCompra> findOne(@PathVariable("id") Integer id) {
        return this.detalleCompraService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public DetalleCompra create(@RequestBody DetalleCompra detalleCompra) {
        return this.detalleCompraService.create(detalleCompra);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.detalleCompraService.destroy(id);
    }


    // by PRECIOS_MAYORES_A
    @GetMapping(path = "/PreciosMayoresA")
    @ResponseBody
    public ArrayList<DetalleCompra> findByPrecioIsGreaterThan (@RequestParam  Float precio) {
        return this.detalleCompraService.findByPrecioIsGreaterThan(precio);
    }


    // by PRECIOS_MENORES_A
    @GetMapping(path = "/PreciosMenoresA")
    @ResponseBody
    public ArrayList<DetalleCompra> findByStockIsLessThan (@RequestParam Float precio) {
        return this.detalleCompraService.findByStockIsLessThan(precio);
    }



}
