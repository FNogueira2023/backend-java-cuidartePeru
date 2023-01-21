package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Compra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Integer> {
}
