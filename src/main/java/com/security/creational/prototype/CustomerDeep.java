package com.security.creational.prototype;

import com.google.gson.Gson;

public class CustomerDeep implements Cloneable{
    private String name;
    private String surname;
    private Address address;

    public CustomerDeep(String name, String surname,Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    protected CustomerDeep clone() throws CloneNotSupportedException {  // deep copy
        Gson gson = new Gson();
        CustomerDeep customerDeep = (CustomerDeep)super.clone();
        String customerDeepJson = gson.toJson(customerDeep);
        return gson.fromJson(customerDeepJson, CustomerDeep.class);
    }

    @Override
    public boolean equals(Object obj) {
        CustomerDeep otherCustomer = (CustomerDeep) obj;
        if (this==otherCustomer) {
            return true;
        }

        if (this.name.equals(otherCustomer.name) && this.surname.equals(otherCustomer.surname)) {
            return true;
        }

        return false;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "CustomerDeep{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }
}
