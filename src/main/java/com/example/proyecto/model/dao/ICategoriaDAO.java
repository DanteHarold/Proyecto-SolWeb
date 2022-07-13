package com.example.proyecto.model.dao;

import com.example.proyecto.model.entity.Categoria;

import org.springframework.data.repository.CrudRepository;

public  interface ICategoriaDAO extends CrudRepository<Categoria,Long>{
    
}
