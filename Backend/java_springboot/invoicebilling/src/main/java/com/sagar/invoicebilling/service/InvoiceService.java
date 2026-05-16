package com.sagar.invoicebilling.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.sagar.invoicebilling.entity.Invoice;

import com.sagar.invoicebilling.entity.Client;
import com.sagar.invoicebilling.entity.Invoice;
import com.sagar.invoicebilling.entity.InvoiceItem;
import com.sagar.invoicebilling.entity.ServiceItem;
import com.sagar.invoicebilling.repository.InvoiceItemRepository;
import com.sagar.invoicebilling.repository.InvoiceRepository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private InvoiceItemRepository invoiceItemRepository;

    public void saveInvoice(Client client,
                            ServiceItem serviceItem,
                            int quantity) {

        double subtotal = quantity * serviceItem.getPrice();

        double tax = subtotal * 0.18;

        double total = subtotal + tax;

        Invoice invoice = new Invoice();

        invoice.setInvoiceNumber(generateInvoiceNumber());

        invoice.setInvoiceDate(LocalDate.now());

        invoice.setSubtotal(subtotal);

        invoice.setTax(tax);

        invoice.setTotal(total);

        invoice.setStatus("UNPAID");

        invoice.setClient(client);

        invoiceRepository.save(invoice);

        InvoiceItem item = new InvoiceItem();

        item.setInvoice(invoice);

        item.setServiceItem(serviceItem);

        item.setQuantity(quantity);

        item.setUnitPrice(serviceItem.getPrice());

        item.setTotal(subtotal);

        invoiceItemRepository.save(item);
    }
    
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
    
    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id).orElse(null);
    }
    
    public List<Invoice> getAgeingInvoices() {

        List<Invoice> invoices =
                invoiceRepository.findAll();

        for (Invoice invoice : invoices) {

            if (!invoice.getStatus().equals("PAID")) {

                long days =
                        ChronoUnit.DAYS.between(
                                invoice.getInvoiceDate(),
                                LocalDate.now());

                invoice.setOverdueDays(days);
            }
        }

        return invoices;
    }

    public String generateInvoiceNumber() {

        long count = invoiceRepository.count() + 1;

        return "INV-2026-" + String.format("%04d", count);
    }
    
    
}