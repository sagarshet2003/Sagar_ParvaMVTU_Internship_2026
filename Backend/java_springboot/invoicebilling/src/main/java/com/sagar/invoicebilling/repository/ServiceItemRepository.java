package com.sagar.invoicebilling.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.invoicebilling.entity.ServiceItem;

public interface ServiceItemRepository extends JpaRepository<ServiceItem, Long> {

}