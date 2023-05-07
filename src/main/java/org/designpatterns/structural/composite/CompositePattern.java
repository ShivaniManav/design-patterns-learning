package org.designpatterns.structural.composite;

public class CompositePattern {

    public static void main(String[] args) {
        CompoundGraphic compoundGraphic = new CompoundGraphic();
        Dot dot = new Dot(1,2);
        Circle circle = new Circle(5, 3, 10);
        compoundGraphic.add(dot);
        compoundGraphic.add(circle);
        compoundGraphic.draw();
    }
}
