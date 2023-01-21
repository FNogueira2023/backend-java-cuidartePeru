package com.example.backendjavacuidarteperu.services;

import com.example.backendjavacuidarteperu.models.Medicamento;
import com.example.backendjavacuidarteperu.repositories.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MedicamentoService {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    public ArrayList<Medicamento> findAll() {
        return (ArrayList<Medicamento>) medicamentoRepository.findAll();
    }

    public Medicamento create(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    public Optional<Medicamento> findOne(Integer id) {
        return medicamentoRepository.findById(id);
    }

    public boolean destroy(Integer id) {
        try {
            medicamentoRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }


}
