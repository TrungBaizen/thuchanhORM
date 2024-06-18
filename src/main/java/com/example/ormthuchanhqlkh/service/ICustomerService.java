package com.example.ormthuchanhqlkh.service;

import com.example.ormthuchanhqlkh.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}
