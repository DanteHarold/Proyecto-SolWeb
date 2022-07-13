package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Material;

public interface IMaterialRepository extends JpaRepository<Material,Long> {
    
}
