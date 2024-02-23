package com.security.creational.prototype;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new Address("Baku","Mahammad hadi");
        Customer customer1 = new Customer("Hilal","Hilalli",address1);
        Customer customer2 = (Customer) customer1.clone();

        System.err.println(customer1);
        System.err.println(customer2);
        System.err.println(customer1.equals(customer2));
        System.err.println(customer1.getAddress().equals(customer2.getAddress()));

        // but this doesn't work for deep copy
        // different path is used for deep copying

        System.err.println("------------------------------");

        // For deep copying, we can convert an object to json and then convert it back to an object.
        // We will use Google's gson library
        Address address2 = new Address("New york","Wall street");
        CustomerDeep customerDeep1 = new CustomerDeep("Joe","Biden",address2);
        CustomerDeep customerDeep2 = customerDeep1.clone();
        System.err.println(customerDeep1);
        System.err.println(customerDeep2);
        System.err.println(customerDeep1.getAddress().equals(customerDeep2.getAddress()));


    }
}
