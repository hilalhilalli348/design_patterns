package com.security.creational.abstract_factory;

public abstract class Car {
    private String model;
    private String color;
    private String fuelType;

    public Car(String model, String color, String fuelType) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    String getColor(){
        return color;
    }
    String getFuelType(){
        return fuelType;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
