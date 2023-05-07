package org.designpatterns.creational.abstractfactory;

public class SportCarFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new SportCar();
    }
}
