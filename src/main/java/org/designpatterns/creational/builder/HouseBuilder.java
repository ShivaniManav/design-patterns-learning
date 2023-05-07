package org.designpatterns.creational.builder;

public class HouseBuilder implements Builder {

    private House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildDoors() {
        house.setDoors(2);
    }

    @Override
    public void buildWindows() {
        house.setWindows(4);
    }

    @Override
    public void buildRooms() {
        house.setRooms(6);
    }

    @Override
    public void buildSwimPool() {
        house.setHasSwimPool(true);
    }

    @Override
    public void buildGarage() {
        house.setHasGarage(true);
    }

    @Override
    public void buildGarden() {
        house.setHasGarden(true);
    }

    public House buildHouse() {
        return house;
    }
}
