package com.example.proyecto.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.proyecto.model.dao.IClienteDAO;
import com.example.proyecto.model.entity.Cliente;
import com.example.proyecto.model.repository.IClienteRepository;

@Service
public class ClienteServiceImp implements IClienteService {

    @Autowired
    private IClienteDAO clienteDAO;

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteDAO.save(cliente);
        
    }

    @Override
    public List<Cliente> cargarClientes() {
        return (List<Cliente>) clienteDAO.findAll();
    }

    @Override
    public Cliente buscarCliente(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteDAO.deleteById(id);
        
    }

    @Override
    public Page<Cliente> getAll(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }
    
}
