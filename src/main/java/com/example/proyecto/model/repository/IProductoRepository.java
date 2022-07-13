package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto,Long> {
    
}
