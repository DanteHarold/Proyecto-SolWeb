package com.example.proyecto.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.model.dao.IDetallePedidoDAO;
import com.example.proyecto.model.entity.DetallePedido;

@Service
public class DetallePedidoServiceImp implements IDetallePedidoService {
    @Autowired
    private IDetallePedidoDAO detallePedidoDAO;

    @Override
    public void guardarDetallePedido(DetallePedido detallePedido) {
        detallePedidoDAO.save(detallePedido);
        
    }

    @Override
    public List<DetallePedido> cargarDetallePedidos() {
       return (List<DetallePedido>) detallePedidoDAO.findAll();
    }

    @Override
    public DetallePedido buscarDetallePedido(Long id) {
        return detallePedidoDAO.findByPedido(id);
    }

   

    


    
}
