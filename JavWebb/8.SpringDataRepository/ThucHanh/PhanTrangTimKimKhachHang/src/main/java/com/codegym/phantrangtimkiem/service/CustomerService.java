package com.codegym.phantrangtimkiem.service;

import com.codegym.phantrangtimkiem.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByName(String name, Pageable pageable);

    void save(Customer customer);

    Customer findById(Integer id);

    void remove(Integer id);

}