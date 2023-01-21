package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

}
