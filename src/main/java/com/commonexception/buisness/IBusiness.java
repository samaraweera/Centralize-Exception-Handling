package com.commonexception.buisness;

import com.commonexception.model.Customer;

import java.util.Optional;


public interface IBusiness {
    public Optional<Customer> getCustomerById(Long id);
}
