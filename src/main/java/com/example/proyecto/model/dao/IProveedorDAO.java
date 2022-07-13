package com.example.proyecto.model.dao;

import com.example.proyecto.model.entity.Proveedor;

import org.springframework.data.repository.CrudRepository;


public interface IProveedorDAO extends CrudRepository<Proveedor,Long> {
    
}
