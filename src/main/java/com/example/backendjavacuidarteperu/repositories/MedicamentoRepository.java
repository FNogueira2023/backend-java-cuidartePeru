package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Medicamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer> {
//    public abstract ArrayList<Medicamento> findByCategoria(String categoria);

//    public abstract ArrayList<Medicamento> findByLaboratorioContains(String laboratorio);
//
//    public abstract ArrayList <Medicamento> findByDescripcionContains(String descripcion);
//
//



}
