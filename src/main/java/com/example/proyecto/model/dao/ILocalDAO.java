package com.example.proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.Local;

public interface ILocalDAO extends CrudRepository<Local,Long> {
    
}
