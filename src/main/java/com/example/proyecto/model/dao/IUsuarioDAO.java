package com.example.proyecto.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
    
    public Usuario findByUsername(String username);

}
