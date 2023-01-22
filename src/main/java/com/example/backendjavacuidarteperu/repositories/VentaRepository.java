package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Integer> {
}
