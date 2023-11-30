package com.hallinearaujo.api_prova2.service;

import com.hallinearaujo.api_prova2.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hallinearaujo.api_prova2.model.Cliente;

@Service
public class ClientesService {

    private ClientesRepository repository;
    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);

        this.repository.save(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
