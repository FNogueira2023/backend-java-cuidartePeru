package com.example.backendjavacuidarteperu.repositories;

import com.example.backendjavacuidarteperu.models.Compra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Integer> {

    public abstract ArrayList<Compra> findByFechaBetween(Date primeraFecha, Date segundaFecha);
}
