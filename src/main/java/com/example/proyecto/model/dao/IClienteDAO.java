package com.example.proyecto.model.dao;


import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.Cliente;


public interface IClienteDAO extends CrudRepository<Cliente,Long> {
}
