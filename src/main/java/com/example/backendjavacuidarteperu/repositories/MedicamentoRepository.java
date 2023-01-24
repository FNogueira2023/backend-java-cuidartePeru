package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Medicamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer> {
    public abstract ArrayList<Medicamento> findByCategoria(String categoria);

    public abstract ArrayList <Medicamento> findByDescripcionContains(String descripcion);

    public abstract ArrayList<Medicamento> findByNombreContains(String nombre);


//    TIRA ERROR Unsatisfied dependency expressed through field
//    Failed to create query for method public abstract java.util.ArrayList
    public abstract ArrayList<Medicamento> findByLaboratorioContains(String laboratorio);





}
