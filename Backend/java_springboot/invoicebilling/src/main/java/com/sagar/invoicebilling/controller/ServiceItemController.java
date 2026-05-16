package com.sagar.invoicebilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sagar.invoicebilling.entity.ServiceItem;
import com.sagar.invoicebilling.service.ServiceItemService;
import org.springframework.ui.Model;
import com.sagar.invoicebilling.entity.ServiceItem;

@Controller
public class ServiceItemController {

    @Autowired
    private ServiceItemService service;

    @GetMapping("/services")
    public String viewServices(Model model) {

        model.addAttribute("services", service.getAllServices());

        return "services";
    }

    @GetMapping("/services/new")
    public String showServiceForm(Model model) {

        model.addAttribute("service",
                new ServiceItem());

        return "service-form";
    }

    @PostMapping("/services/save")
    public String saveService(@ModelAttribute ServiceItem serviceItem) {

        service.saveService(serviceItem);

        return "redirect:/services";
    }

    @GetMapping("/services/edit/{id}")
    public String editService(@PathVariable Long id, Model model) {

        ServiceItem serviceItem = service.getServiceById(id);

        model.addAttribute("serviceItem", serviceItem);

        return "service-form";
    }

    @GetMapping("/services/delete/{id}")
    public String deleteService(@PathVariable Long id) {

        service.deleteService(id);

        return "redirect:/services";
    }
}