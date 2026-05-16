package com.sagar.invoicebilling.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.invoicebilling.entity.Invoice;
import com.sagar.invoicebilling.entity.Payment;
import com.sagar.invoicebilling.repository.InvoiceRepository;
import com.sagar.invoicebilling.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void savePayment(Invoice invoice,
                            double amount,
                            String paymentMode) {

        Payment payment = new Payment();

        payment.setInvoice(invoice);

        payment.setAmount(amount);

        payment.setPaymentMode(paymentMode);

        payment.setPaymentDate(LocalDate.now());

        paymentRepository.save(payment);

        // IMPORTANT
        invoice.setStatus("PAID");

        invoiceRepository.save(invoice);
    }
}