package com.security.creational.prototype;

public class Customer implements Cloneable{
    private String name;
    private String surname;
    private Address address;

    public Customer(String name, String surname,Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {  // shallow copy
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        Customer otherCustomer = (Customer) obj;
        if (this==otherCustomer) {
            return true;
        }

        if (this.name.equals(otherCustomer.name) &&
                this.surname.equals(otherCustomer.surname)) {
            return true;
        }

        return false;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }
}
