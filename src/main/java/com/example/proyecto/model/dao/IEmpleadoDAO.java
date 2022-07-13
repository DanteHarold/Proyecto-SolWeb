package com.example.proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.Empleado;

public interface IEmpleadoDAO extends CrudRepository<Empleado,Long> {
    
}
