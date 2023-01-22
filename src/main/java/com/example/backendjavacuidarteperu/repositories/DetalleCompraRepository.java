package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.DetalleCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleCompraRepository extends CrudRepository<DetalleCompra, Integer> {
}
