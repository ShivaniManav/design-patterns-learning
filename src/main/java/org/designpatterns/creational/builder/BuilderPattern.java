package org.designpatterns.creational.builder;

public class BuilderPattern {

    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.makeHouseWithGarden(builder);
        House house = builder.buildHouse();
        System.out.println(house.toString());
    }
}
