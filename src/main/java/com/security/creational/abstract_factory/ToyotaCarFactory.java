package com.security.creational.abstract_factory;

public class ToyotaCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar(Cars carModel) {
            Car car = null;
            switch (carModel){
                case Toyota_Belta -> car=new Toyota("Toyota Belta","Black","Oil");
                case Toyota_Avalon -> car=new Toyota("Toyota Avalon","White","Oil");
            }
            return car;
    }
}
