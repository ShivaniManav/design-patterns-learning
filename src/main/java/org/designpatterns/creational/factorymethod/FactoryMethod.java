package org.designpatterns.creational.factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();
    }
}
