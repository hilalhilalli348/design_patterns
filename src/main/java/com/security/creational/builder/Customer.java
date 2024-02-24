package com.security.creational.builder;

public class Customer {
    private String name;
    private String surname;

    private String address;

    private Customer() {}

    public Customer(CustomerBuilder customerBuilder) {
        this.name = customerBuilder.name;
        this.surname = customerBuilder.surname;
        this.address = customerBuilder.address;
    }

    public static class CustomerBuilder{
        private String name;
        private String surname;
        private String address;

        public CustomerBuilder(String name,String surname){  // mandatory props
            this.name = name;
            this.surname = surname;
        }

        public CustomerBuilder setAddress(String address){ // optional props
            this.address = address;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
