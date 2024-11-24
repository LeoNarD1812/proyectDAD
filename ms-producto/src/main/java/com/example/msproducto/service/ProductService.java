package com.example.msproducto.service;

import com.example.msproducto.entity.Producto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    // Listar todos los productos
    List<Producto> list();

    // Guardar un producto con o sin imagen
    Producto save(Producto product) throws IOException;

    // Buscar un producto por ID
    Optional<Producto> findById(Integer id);

    // Actualizar un producto existente
    Producto update(Producto product) throws IOException;

    // Eliminar un producto por ID
    void deleteById(Integer id);
}
