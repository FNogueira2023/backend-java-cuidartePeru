package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.Medicamento;
import com.example.backendjavacuidarteperu.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    MedicamentoService medicamentoService;

    @GetMapping()
    public ArrayList<Medicamento> findAll() {
        return this.medicamentoService.findAll();
    }


    @GetMapping(path = "/{id}")
    public Optional<Medicamento> findOne(@PathVariable("id") Integer id) {
        return this.medicamentoService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public Medicamento create(@RequestBody Medicamento medicamento) {
        return this.medicamentoService.create(medicamento);
    }

    @DeleteMapping(path = "{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.medicamentoService.destroy(id);
    }

    // by CATEGORIA
    @GetMapping(path = "/busquedaPorCategoria")
    public ArrayList<Medicamento> findByCategory(@RequestParam String categoria) {
        return this.medicamentoService.findByCategory(categoria);
    }

    // by DESCRIPCION
    @GetMapping(path = "/busquedaPorDescripcion")
    public ArrayList<Medicamento> findByDescripcion(@RequestParam String descripcion) {
        return this.medicamentoService.findByDescripcion(descripcion);
    }

}
