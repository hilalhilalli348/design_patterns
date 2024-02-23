package com.security.creational.singleton;

import java.util.Objects;
public class CustomerService implements Servable{
    private static CustomerService customerService;
    private CustomerService(){}

    public static CustomerService getInstance() { // not thread safe
        if (Objects.isNull(customerService)){
            customerService = new CustomerService();
        }
        return customerService;
    }

    @Override
    public void serve(){
        System.err.println("CustomerService");
    }
}
