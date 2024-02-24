package com.security.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {

        AbstractCarFactory bmwFactory = new BmwCarFactory();
        AbstractCarFactory toyotaFactory = new ToyotaCarFactory();


        Car bmw = bmwFactory.createCar(Cars.BMW_F40);
        Car toyota = toyotaFactory.createCar(Cars.Toyota_Avalon);

        System.err.println(bmw);
        System.err.println(toyota);

    }
}
