package com.security.creational.abstract_factory;

public class BmwCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar(Cars carModel) {
        Car car = null;
        switch (carModel){
            case BMW_F40 -> car=new Bmw("BMW F40","Black","Oil");
            case BMW_F52 -> car=new Bmw("BMW F52","White","Oil");
        }
        return car;
    }
}
