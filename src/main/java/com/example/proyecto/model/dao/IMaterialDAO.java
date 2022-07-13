package com.example.proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.Material;

public interface IMaterialDAO extends CrudRepository<Material,Long> {
    
}
