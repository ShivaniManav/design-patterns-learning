package org.designpatterns.creational.abstractfactory;

public class SportCar implements Car {

    @Override
    public void engineDetails() {
        System.out.println("sports car engine");
    }

    @Override
    public void brandName() {
        System.out.println("McLaren");
    }
}
