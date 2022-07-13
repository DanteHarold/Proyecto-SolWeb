package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente,Long> {
}
