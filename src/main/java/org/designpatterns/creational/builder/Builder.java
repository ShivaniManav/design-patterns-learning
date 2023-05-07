package org.designpatterns.creational.builder;

/**
 * Builder interface in builder pattern has methods for building parts to create a complete entity.
 * Here the entity is House and its parts are doors, windows, rooms etc.
 * This interface is then implemented by the entity builder class i.e. HouseBuilder in our case.
 */
public interface Builder {

    public void reset();

    public void buildDoors();

    public void buildWindows();

    public void buildRooms();

    public void buildSwimPool() ;

    public void buildGarage();

    public void buildGarden();

}
