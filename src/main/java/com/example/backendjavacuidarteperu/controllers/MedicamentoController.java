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

    //    by NOMBRE
    @GetMapping(path = "/busquedaPorNombre")
    public ArrayList<Medicamento> findByName (@RequestParam String nombre) {
        return this.medicamentoService.findByName(nombre);
    }

    //     by CATEGORIA
    @GetMapping(path = "/busquedaPorCategoria")
    public ArrayList<Medicamento> findByCategory(@RequestParam String categoria) {
        return this.medicamentoService.findByCategory(categoria);
    }

    //    by DESCRIPCION
    @GetMapping(path = "/busquedaPorDescripcion")
    public ArrayList<Medicamento> findByDescription(@RequestParam String descripcion) {
        return this.medicamentoService.findByDescripcion(descripcion);
    }


//    by Laboratorio
    @GetMapping(path = "/busquedaPorLaboratorio")
    public ArrayList<Medicamento> findByLaboratory(@RequestParam String laboratorio) {
        return this.medicamentoService.findByLaboratory(laboratorio);
    }
}
