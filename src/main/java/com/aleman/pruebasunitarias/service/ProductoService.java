package com.aleman.pruebasunitarias.service;

import com.aleman.pruebasunitarias.model.Producto;
import com.aleman.pruebasunitarias.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }
}