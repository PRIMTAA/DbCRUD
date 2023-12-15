package com.sqlConnect.DbCRUD.service.impl;

import com.sqlConnect.DbCRUD.model.Customer;
import com.sqlConnect.DbCRUD.repo.CustomerRepo;
import com.sqlConnect.DbCRUD.service.CustomerServices;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServicesImpl implements CustomerServices {

    CustomerRepo customerRepo;

    public CustomerServicesImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepo.findById(id).get() ;
    }

    @Override
    public String createCustomer(Customer customer) {
        customerRepo.save(customer);
        return "Customer details have been saved";
    }

    @Override
    public String updateCustomer(Customer customer) {
        customerRepo.save(customer);
        return "Customer details have been updated";
    }

    @Override
    public String deleteCustomer(Integer id) {
        customerRepo.deleteById(id);
        return "customer details removed";
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public String deleteAllCustomers() {
        customerRepo.deleteAll();
        return "database has been cleared";
    }
}
