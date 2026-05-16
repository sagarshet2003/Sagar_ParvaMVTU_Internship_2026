package com.sagar.invoicebilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sagar.invoicebilling.entity.Invoice;
import com.sagar.invoicebilling.service.InvoiceService;
import com.sagar.invoicebilling.service.PaymentService;

@Controller
public class PaymentController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payments/new")
    public String showPaymentForm(Model model) {

        model.addAttribute("invoices",
                invoiceService.getAllInvoices());

        return "payment-form";
    }

    @PostMapping("/payments/save")
    public String savePayment(@RequestParam Long invoiceId,
                              @RequestParam double amount,
                              @RequestParam String paymentMode) {

        Invoice invoice =
                invoiceService.getInvoiceById(invoiceId);

        paymentService.savePayment(invoice,
                amount,
                paymentMode);

        return "redirect:/invoices";
    }
}