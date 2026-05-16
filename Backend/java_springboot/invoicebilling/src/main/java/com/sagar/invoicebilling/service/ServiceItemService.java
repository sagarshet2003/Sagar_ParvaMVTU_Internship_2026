package com.sagar.invoicebilling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.invoicebilling.entity.ServiceItem;
import com.sagar.invoicebilling.repository.ServiceItemRepository;

@Service
public class ServiceItemService {

    @Autowired
    private ServiceItemRepository repository;

    public List<ServiceItem> getAllServices() {
        return repository.findAll();
    }

    public void saveService(ServiceItem serviceItem) {
        repository.save(serviceItem);
    }

    public ServiceItem getServiceById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteService(Long id) {
        repository.deleteById(id);
    }
}