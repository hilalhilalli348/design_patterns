package com.security.creational.singleton;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService1 = CustomerService.getInstance();
        CustomerService customerService2 = CustomerService.getInstance();
        customerService1.serve();
        System.err.println("customerService1 == customerService2 : "+customerService1.equals(customerService2));


        CustomerServiceSafe customerServiceSafe1 = CustomerServiceSafe.getInstance();
        CustomerServiceSafe customerServiceSafe2 = CustomerServiceSafe.getInstance();
        customerServiceSafe1.serve();
        System.err.println("customerServiceSafe1 == customerServiceSafe2 : "+customerServiceSafe1.equals(customerServiceSafe2));

    }
}
