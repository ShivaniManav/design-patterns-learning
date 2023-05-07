package org.designpatterns.creational.abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {
        SportCar sportCar = (SportCar) CarFactory.getCarObject("SPORT");
        sportCar.engineDetails();
        sportCar.brandName();
    }
}
