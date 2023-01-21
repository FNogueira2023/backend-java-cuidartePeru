package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Medicamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Integer> {
}
