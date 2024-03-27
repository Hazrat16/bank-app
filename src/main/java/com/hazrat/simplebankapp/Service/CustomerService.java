package com.hazrat.simplebankapp.Service;

import com.hazrat.simplebankapp.dao.CustomerDAO;
import com.hazrat.simplebankapp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDAO  customerDAO;

   public List<Customer> getAllCustomers(){
    return customerDAO.findAll();
    }

   public void addCustomers(Customer customer){
    customerDAO.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerDAO.findById(id).orElseThrow(()-> new RuntimeException("invalid customer ID"));
    }

    public void deleteCustomerById(Long id){
    Customer customer = customerDAO.findById(id).orElse(null);
    if(id != null){
        customerDAO.deleteById(id);
    }else {
    throw new RuntimeException("Customer is not existed");}
    }
}
