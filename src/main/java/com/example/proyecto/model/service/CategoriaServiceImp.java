package com.example.proyecto.model.service;

import java.util.List;

import com.example.proyecto.model.dao.ICategoriaDAO;
import com.example.proyecto.model.entity.Categoria;
import com.example.proyecto.model.repository.ICategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImp implements ICategoriaService {

    @Autowired
    private ICategoriaDAO categoriaDAO;

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    public String guardarCategoria(Categoria categoria) {
        
        String rpta = "";
        try{
            categoriaDAO.save(categoria);
            rpta = "Cátegoria Guardada de Forma Exitosa";
        }catch (Exception e) {
            rpta = e.getMessage();
        }
        return rpta;

    }

    @Override
    public List<Categoria> cargarCategorias() {
        return (List<Categoria>)categoriaDAO.findAll();
    }

    @Override
    public Categoria buscarCategoria(Long id) {
        return categoriaDAO.findById(id).orElse(null);
    }

    @Override
    public String eliminarCategoria(Long id) {

        String rpta = "";
        try{
            categoriaDAO.deleteById(id);
            rpta = "Categoria Eliminada De Forma Exitosa";
        }catch (Exception e) {
            rpta = e.getMessage();
        }
        return rpta;
        
    }

    @Override
    public Page<Categoria> getAll(Pageable pageable) {
        return categoriaRepository.findAll(pageable);
    }
    
}
