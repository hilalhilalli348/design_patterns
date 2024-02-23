package com.security.creational.singleton;

import java.util.Objects;

public class CustomerServiceSafe implements Servable{
    private static CustomerServiceSafe customerServiceSafe;
    private CustomerServiceSafe(){}

    public static CustomerServiceSafe getInstance() {
        synchronized (CustomerService.class){  // thread safe
            if (Objects.isNull(customerServiceSafe)){
                customerServiceSafe = new CustomerServiceSafe();
            }
        }
        return customerServiceSafe;
    }

    @Override
    public void serve(){
        System.err.println("CustomerServiceSafe");
    }
}
