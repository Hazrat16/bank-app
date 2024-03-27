package com.hazrat.simplebankapp.dao;

import com.hazrat.simplebankapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<Customer,Long> {
}
