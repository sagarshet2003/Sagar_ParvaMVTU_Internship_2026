package com.sagar.invoicebilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.sagar.invoicebilling.entity.Client;
import com.sagar.invoicebilling.service.ClientService;

@Controller
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/clients")
    public String viewClients(Model model) {

        model.addAttribute("clients", service.getAllClients());

        return "clients";
    }

    @GetMapping("/clients/new")
    public String showClientForm(Model model) {

        model.addAttribute("client", new Client());

        return "client-form";
    }
    
    @GetMapping("/clients/delete/{id}")
    public String deleteClient(@PathVariable Long id) {

        service.deleteClient(id);

        return "redirect:/clients";
    }
    
    @GetMapping("/clients/edit/{id}")
    public String editClient(@PathVariable Long id, Model model) {

        Client client = service.getClientById(id);

        model.addAttribute("client", client);

        return "client-form";
    }

    @PostMapping("/clients/save")
    public String saveClient(@ModelAttribute Client client) {

        service.saveClient(client);

        return "redirect:/clients";
    }
}