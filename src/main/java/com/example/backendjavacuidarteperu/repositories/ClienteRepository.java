package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Integer> {
}
