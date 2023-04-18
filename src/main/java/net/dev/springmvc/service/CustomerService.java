package net.dev.springmvc.service;

import java.util.List;

import net.dev.springmvc.entity.Customer;
import net.dev.springmvc.exception.ResourceNotFoundException;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId) throws ResourceNotFoundException;

    public void deleteCustomer(int theId) throws ResourceNotFoundException;
}