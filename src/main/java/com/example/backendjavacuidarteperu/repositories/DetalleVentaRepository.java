package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.DetalleVenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends CrudRepository<DetalleVenta, Integer> {
}
