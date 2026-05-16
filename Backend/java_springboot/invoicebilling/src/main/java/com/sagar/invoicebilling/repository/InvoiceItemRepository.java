package com.sagar.invoicebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.invoicebilling.entity.InvoiceItem;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {

}