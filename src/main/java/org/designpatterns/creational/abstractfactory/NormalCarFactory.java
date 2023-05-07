package org.designpatterns.creational.abstractfactory;

public class NormalCarFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new NormalCar();
    }
}
