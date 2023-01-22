package com.example.backendjavacuidarteperu.controllers;

import com.example.backendjavacuidarteperu.models.Cliente;
import com.example.backendjavacuidarteperu.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<Cliente> findAll() {
        return this.clienteService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> findOne(@PathVariable("id") Integer id) {
        return this.clienteService.findOne(id);
    }

    @PostMapping(path = "/create", consumes = {"application/json"})
    public Cliente create(@RequestBody Cliente cliente) {
        return this.clienteService.create(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public boolean delete(@PathVariable("id") Integer id) {
        return this.clienteService.destroy(id);
    }

}
