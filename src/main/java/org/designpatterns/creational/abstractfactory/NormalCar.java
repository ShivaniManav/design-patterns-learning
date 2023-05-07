package org.designpatterns.creational.abstractfactory;

public class NormalCar implements Car {

    @Override
    public void engineDetails() {
        System.out.println("normal car engine");
    }

    @Override
    public void brandName() {
        System.out.println("Skoda");
    }
}
