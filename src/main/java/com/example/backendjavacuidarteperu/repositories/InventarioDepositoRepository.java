package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.InventarioDeposito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioDepositoRepository extends CrudRepository<InventarioDeposito, Integer> {
}
