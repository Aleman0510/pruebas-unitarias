package com.aleman.pruebasunitarias.repository;

import com.aleman.pruebasunitarias.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}