package com.security.creational.static_factory_method;

public class Customer {
    private String anyField;
    private Customer(){}
    // static factory method
    // You can use the builder design pattern here to assign values to fields."
    public static Customer of(){
        return new Customer();
    }
}
