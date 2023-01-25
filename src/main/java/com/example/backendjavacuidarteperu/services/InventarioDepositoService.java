package com.example.backendjavacuidarteperu.services;

import com.example.backendjavacuidarteperu.models.InventarioDeposito;
import com.example.backendjavacuidarteperu.repositories.InventarioDepositoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class InventarioDepositoService {

    @Autowired
    InventarioDepositoRepository inventarioDepositoRepository;

    public ArrayList<InventarioDeposito> findAll() {
        return (ArrayList<InventarioDeposito>) inventarioDepositoRepository.findAll();
    }

    public InventarioDeposito create(InventarioDeposito inventarioDeposito) {
        return inventarioDepositoRepository.save(inventarioDeposito);
    }

    public Optional<InventarioDeposito> findOne(Integer id) {
        return inventarioDepositoRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            inventarioDepositoRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }

    }

    // by STOCK_MENOR_A
    public ArrayList<InventarioDeposito> findByStockIsLessThan(Integer cantidadStock) {
        return this.inventarioDepositoRepository.findByStockIsLessThan(cantidadStock);
    }

    // by STOCK_MAYOR_A
    public ArrayList<InventarioDeposito> findByStockIsGreaterThan(Integer cantidadStock) {
        return this.inventarioDepositoRepository.findByStockIsGreaterThan(cantidadStock);
    }


}
