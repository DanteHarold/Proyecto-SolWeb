package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Local;

public interface ILocalRepository extends JpaRepository<Local,Long> {
    
}
