package com.sagar.invoicebilling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.invoicebilling.entity.Client;
import com.sagar.invoicebilling.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getAllClients() {
        return repository.findAll();
    }

    public void saveClient(Client client) {
        repository.save(client);
    }

    public void deleteClient(Long id) {
        repository.deleteById(id);
    }
    
    public Client getClientById(Long id) {
        return repository.findById(id).orElse(null);
    }
}