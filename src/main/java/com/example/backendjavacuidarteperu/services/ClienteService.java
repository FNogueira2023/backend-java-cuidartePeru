package com.example.backendjavacuidarteperu.services;

import com.example.backendjavacuidarteperu.models.Cliente;
import com.example.backendjavacuidarteperu.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    public ArrayList<Cliente> findAll() {
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> findOne(Integer id) {
        return clienteRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }

    }
}