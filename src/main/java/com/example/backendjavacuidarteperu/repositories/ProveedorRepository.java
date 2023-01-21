package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Proveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Integer> {
}
