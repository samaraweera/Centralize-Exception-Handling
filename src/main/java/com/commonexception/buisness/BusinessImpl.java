package com.commonexception.buisness;

import com.commonexception.dao.CustomerDAO;
import com.commonexception.exception.CustomerNotFoundException;
import com.commonexception.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BusinessImpl implements IBusiness {

    @Autowired
    CustomerDAO customerDAO;

    @Override
    public Optional<Customer> getCustomerById(Long id) {

        Optional<Customer> customer = null;
        try{
            customer  = customerDAO.findById(id);
        }catch (Exception e){
             //return new CustomerNotFoundException("Not found  "+id);
        }
        return customer;
    }
}
