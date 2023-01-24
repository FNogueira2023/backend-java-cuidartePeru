package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.InventarioDeposito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface InventarioDepositoRepository extends CrudRepository<InventarioDeposito, Integer> {

    public abstract ArrayList<InventarioDeposito> findByStockIsLessThan(Integer cantidadStock);

    public abstract ArrayList<InventarioDeposito> findByStockIsGreaterThan(Integer cantidadStock);
}
