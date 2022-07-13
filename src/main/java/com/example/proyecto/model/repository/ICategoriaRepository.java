package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria,Long> {
    
}
