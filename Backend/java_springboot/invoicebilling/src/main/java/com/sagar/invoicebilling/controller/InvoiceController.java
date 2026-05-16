package com.sagar.invoicebilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sagar.invoicebilling.entity.Client;
import com.sagar.invoicebilling.entity.ServiceItem;
import com.sagar.invoicebilling.service.ClientService;
import com.sagar.invoicebilling.service.InvoiceService;
import com.sagar.invoicebilling.service.ServiceItemService;

import java.nio.charset.StandardCharsets;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.sagar.invoicebilling.service.PdfService;
import org.springframework.web.bind.annotation.PathVariable;

import com.sagar.invoicebilling.entity.Invoice;
import com.sagar.invoicebilling.service.EmailService;

@Controller
public class InvoiceController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ServiceItemService serviceItemService;

    @Autowired
    private InvoiceService invoiceService;
    
    @Autowired
    private PdfService pdfService;

    @Autowired
    private TemplateEngine templateEngine;
    
    @Autowired
    private EmailService emailService;

    @GetMapping("/invoices/new")
    public String showInvoiceForm(Model model) {

        model.addAttribute("clients",
                clientService.getAllClients());

        model.addAttribute("services",
                serviceItemService.getAllServices());

        return "invoice-form";
    }
    
    @GetMapping("/invoices")
    public String viewInvoices(Model model) {

        model.addAttribute("invoices",
                invoiceService.getAllInvoices());

        return "invoice-list";
    }
    
    @GetMapping("/invoices/pdf/{id}")
    public ResponseEntity<byte[]> generatePdf(@PathVariable Long id) {

        Invoice invoice =
                invoiceService.getInvoiceById(id);

        Context context = new Context();

        context.setVariable("invoice", invoice);

        String html =
                templateEngine.process("invoice-pdf",
                        context);

        byte[] pdf =
                pdfService.generatePdf(html);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=invoice.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }
    
    @GetMapping("/invoices/email/{id}")
    public String sendInvoiceEmail(@PathVariable Long id) {

        Invoice invoice =
                invoiceService.getInvoiceById(id);

        Context context = new Context();

        context.setVariable("invoice", invoice);

        String html =
                templateEngine.process("invoice-pdf",
                        context);

        byte[] pdf =
                pdfService.generatePdf(html);

        emailService.sendInvoice(
                invoice.getClient().getEmail(),
                pdf);

        return "redirect:/invoices";
    }
    
    @GetMapping("/reports/ageing")
    public String ageingReport(Model model) {

        model.addAttribute("invoices",
                invoiceService.getAgeingInvoices());

        return "ageing-report";
    }

    @PostMapping("/invoices/save")
    public String saveInvoice(@RequestParam Long clientId,
                              @RequestParam Long serviceId,
                              @RequestParam int quantity) {

        Client client =
                clientService.getClientById(clientId);

        ServiceItem serviceItem =
                serviceItemService.getServiceById(serviceId);

        invoiceService.saveInvoice(client,
                serviceItem,
                quantity);

        return "redirect:/invoices/new";
    }
}