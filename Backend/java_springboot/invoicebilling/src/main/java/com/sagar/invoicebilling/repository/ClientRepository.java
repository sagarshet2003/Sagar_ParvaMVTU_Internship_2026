package com.sagar.invoicebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.invoicebilling.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}