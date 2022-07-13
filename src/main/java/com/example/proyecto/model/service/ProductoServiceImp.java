package com.example.proyecto.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.proyecto.model.dao.IProductoDAO;
import com.example.proyecto.model.entity.Producto;
import com.example.proyecto.model.repository.IProductoRepository;

@Service
public class ProductoServiceImp implements IProductoService {

    @Autowired
    private IProductoDAO productoDAO;
    
    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public String guardarProducto(Producto producto) {
        String rpta = "";
        try{
            productoDAO.save(producto);
            rpta = "Se guardó el Producto Exitosamente";
        }catch (Exception e) {
            rpta = e.getMessage();
        }
        return rpta;
    }

    @Override
    public String eliminarProducto(long id) {
        String rpta = "";
        try{
            productoDAO.deleteById(id);
            rpta = "Producto Eliminado Exitosamente";
        }catch (Exception e) {
            rpta = e.getMessage();
        }
        return rpta;
    }

    @Override
    public List<Producto> cargarProductos() {
         return (List<Producto>) productoDAO.findAll();
    }

    @Override
    public Page<Producto> getAll(Pageable pageable) {
        return productoRepository.findAll(pageable);
    }

    @Override
    public Producto buscarProducto(Long id) {
        return productoDAO.findById(id).orElse(null);
    }
    
}
