package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.InventarioDeposito;
import com.example.backendjavacuidarteperu.services.InventarioDepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/inventarios")
public class InventarioDepositoController {

    @Autowired
    InventarioDepositoService inventarioDepositoService;

    @GetMapping()
    public ArrayList<InventarioDeposito> findAll() {
        return this.inventarioDepositoService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<InventarioDeposito> findOne(@PathVariable("id") Integer id) {
        return this.inventarioDepositoService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public InventarioDeposito create (@RequestBody InventarioDeposito inventarioDeposito) {
        return this.inventarioDepositoService.create(inventarioDeposito);
    }

    @DeleteMapping(path = "{id}")
    public boolean delete(@PathVariable("id") Integer id ) {
        return this.inventarioDepositoService.destroy(id);
    }


    // by STOCK_MENOR_A
    @GetMapping(path = "/stockMenorA")
    public ArrayList<InventarioDeposito> findByStockIsLessThan(@RequestParam Integer cantidadStock) {
        return this.inventarioDepositoService.findByStockIsLessThan(cantidadStock);
    }

    // by STOCK_MAYOR_A
    @GetMapping(path = "/stockMayorA")
    public ArrayList<InventarioDeposito> findByStockIsGreaterThan(@RequestParam Integer cantidadStock) {
        return this.inventarioDepositoService.findByStockIsGreaterThan(cantidadStock);
    }
}
