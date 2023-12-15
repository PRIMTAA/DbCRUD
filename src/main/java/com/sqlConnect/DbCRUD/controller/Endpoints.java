package com.sqlConnect.DbCRUD.controller;

import com.sqlConnect.DbCRUD.model.Customer;
import com.sqlConnect.DbCRUD.service.CustomerServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Endpoints {

    CustomerServices customerServices;

    public Endpoints(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @GetMapping("/{id}")
    public Customer getDetails(@PathVariable Integer id){
        return customerServices.getCustomer(id);
    }

    @GetMapping("/all")
    public List<Customer> getDB(){
        return customerServices.getAllCustomers();
    }

    @PostMapping("/newCustomer")
    public void createCustomer(@RequestBody Customer customer){
        customerServices.createCustomer(customer);
    }

    @PutMapping("/editCustomer")
    public String updateCustomer(@RequestBody Customer customer){
        customerServices.updateCustomer(customer);
        return "update done";
    }

    @DeleteMapping("/{id}")
    public String removeCustomer(@PathVariable Integer id){
        customerServices.deleteCustomer(id);
        return id+" customer removed";
    }

    @DeleteMapping("/all")
    public String emptyDb(){
        customerServices.deleteAllCustomers();
        return "db empty success";
    }

}
