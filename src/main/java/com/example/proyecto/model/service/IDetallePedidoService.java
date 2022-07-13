package com.example.proyecto.model.service;

import java.util.List;


import com.example.proyecto.model.entity.DetallePedido;

public interface IDetallePedidoService  {
    public void guardarDetallePedido(DetallePedido detallePedido);
    public DetallePedido buscarDetallePedido(Long id);
    public List<DetallePedido> cargarDetallePedidos();
    
   
}
