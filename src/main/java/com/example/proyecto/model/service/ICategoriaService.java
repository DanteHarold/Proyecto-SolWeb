package com.example.proyecto.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.proyecto.model.entity.Categoria;

public interface ICategoriaService {
    public String guardarCategoria(Categoria categoria);
    public List<Categoria> cargarCategorias();
    public Categoria buscarCategoria(Long id);
    public String eliminarCategoria(Long id);
    Page<Categoria> getAll(Pageable pageable);
}
