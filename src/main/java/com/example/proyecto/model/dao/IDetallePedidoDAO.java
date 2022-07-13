package com.example.proyecto.model.dao;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.proyecto.model.entity.DetallePedido;

public interface IDetallePedidoDAO extends CrudRepository<DetallePedido,Long> {
    
    public DetallePedido findByPedido(Long id);
}
