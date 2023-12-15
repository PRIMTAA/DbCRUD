package com.sqlConnect.DbCRUD.service;

import com.sqlConnect.DbCRUD.model.Customer;

import java.util.List;

public interface CustomerServices {

    public Customer getCustomer(Integer id);
    public String createCustomer(Customer customer);
    public String updateCustomer(Customer customer);
    public String deleteCustomer(Integer id);
    public List<Customer> getAllCustomers();
    public String deleteAllCustomers();
}
