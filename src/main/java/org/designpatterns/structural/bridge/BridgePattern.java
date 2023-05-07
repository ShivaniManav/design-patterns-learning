package org.designpatterns.structural.bridge;

public class BridgePattern {

    public static void main(String[] args) {
        Red red = new Red();
        Rectangle rectangle = new Rectangle(10, 20, red);
        rectangle.printShapeDetails();
    }
}
