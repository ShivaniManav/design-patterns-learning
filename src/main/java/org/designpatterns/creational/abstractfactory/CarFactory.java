package org.designpatterns.creational.abstractfactory;

public abstract class CarFactory {

    public static Car getCarObject(String carType) {
        if("SPORT".equals(carType)) {
            return new SportCarFactory().createCar();
        } else {
            return new NormalCarFactory().createCar();
        }
    }

    public abstract Car createCar();

    /**
     * The whole point of AbstractFactory is that it can
     * create objects of its sub categories while providing a common interface to create objects.
     * for example:- we can create car body, wheel and engine which are parts of car
     * while providing a common interface to create all these part which is SportCarFactory or NormalCarFactory
     */

    // can also have
    // public abstract Engine createEngine();
    // public abstract Wheel createWheel();
    // Public abstract Body createBody();
}
