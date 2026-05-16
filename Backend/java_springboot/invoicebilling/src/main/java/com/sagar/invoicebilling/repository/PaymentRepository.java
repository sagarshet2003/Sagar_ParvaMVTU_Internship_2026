package com.sagar.invoicebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.invoicebilling.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}