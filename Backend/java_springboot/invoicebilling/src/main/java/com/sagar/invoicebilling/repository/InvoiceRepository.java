package com.sagar.invoicebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.invoicebilling.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}