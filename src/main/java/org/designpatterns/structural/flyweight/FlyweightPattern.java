package org.designpatterns.structural.flyweight;

public class FlyweightPattern {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(2,2, "mango tree", "green", "rough");
        forest.plantTree(4,4, "guava tree", "green", "rough");
        forest.drawForest();
    }
}
