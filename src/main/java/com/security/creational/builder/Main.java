package com.security.creational.builder;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer
                .CustomerBuilder("Hilal","Hilalli")
                .setAddress("Baku,Mahammad hadi")
                .build();

        System.err.println(customer);

    }
}
