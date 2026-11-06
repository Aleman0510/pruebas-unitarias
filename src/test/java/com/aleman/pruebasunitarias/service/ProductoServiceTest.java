package com.aleman.pruebasunitarias.service;

import com.aleman.pruebasunitarias.model.Producto;
import com.aleman.pruebasunitarias.repository.ProductoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @Test
    @DisplayName("findAll devuelve la lista de productos del repositorio")
    void findAll_debeRetornarListaDeProductos() {
        // Arrange
        Producto p1 = new Producto(1L, "Laptop", 15000.0);
        Producto p2 = new Producto(2L, "Mouse", 250.0);
        when(productoRepository.findAll()).thenReturn(List.of(p1, p2));

        // Act
        List<Producto> resultado = productoService.findAll();

        // Assert
        assertThat(resultado).hasSize(2).containsExactly(p1, p2);
        assertThat(resultado.get(0).getNombre()).isEqualTo("Laptop");
        verify(productoRepository, times(1)).findAll();
    }

    @Test
    @DisplayName("create guarda un nuevo producto y devuelve el objeto persistido")
    void create_debeGuardarProductoNuevo() {
        // Arrange
        Producto nuevo = new Producto(null, "Teclado", 800.0);
        Producto guardado = new Producto(3L, "Teclado", 800.0);
        when(productoRepository.save(any(Producto.class))).thenReturn(guardado);

        // Act
        Producto resultado = productoService.create(nuevo);

        // Assert
        assertThat(resultado).isNotNull();
        assertThat(resultado.getId()).isEqualTo(3L);
        assertThat(resultado.getNombre()).isEqualTo("Teclado");
        assertThat(resultado.getPrecio()).isEqualTo(800.0);
        verify(productoRepository, times(1)).save(nuevo);
    }
}