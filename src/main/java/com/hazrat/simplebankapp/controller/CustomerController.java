package com.hazrat.simplebankapp.controller;

import com.hazrat.simplebankapp.Service.AccountService;
import com.hazrat.simplebankapp.Service.CustomerService;
import com.hazrat.simplebankapp.entity.Account;
import com.hazrat.simplebankapp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomers(customer);
        accountService.addAccount(new Account(customer.getId(), "Savings","Active", Double.valueOf(0)));
    }

    @GetMapping("/customer/id/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/customer/id/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
        accountService.deleteAccountById(id);
    }
}
