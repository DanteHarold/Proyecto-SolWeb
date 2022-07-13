package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado,Long> {
    
}
