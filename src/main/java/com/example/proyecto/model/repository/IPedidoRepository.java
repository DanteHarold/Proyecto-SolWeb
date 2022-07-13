package com.example.proyecto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyecto.model.entity.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido,Long> {
    
}
