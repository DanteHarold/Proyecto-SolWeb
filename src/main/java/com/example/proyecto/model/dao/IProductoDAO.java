package com.example.proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long> {
    
}
