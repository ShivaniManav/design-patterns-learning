package org.designpatterns.creational.builder;


/**
 * Director class in a builder pattern can be used to direct the builder class to how to build.
 */
public class Director {

    public Builder makeNormalHouse(Builder builder) {
        builder.reset();
        builder.buildDoors();
        builder.buildWindows();
        builder.buildRooms();
        return builder;
    }

    public Builder makeHouseWithGarden(Builder builder) {
        builder.reset();
        builder.buildDoors();
        builder.buildWindows();
        builder.buildRooms();
        builder.buildGarden();
        return builder;
    }

}
