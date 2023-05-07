package org.designpatterns.creational.prototype;

public class PrototypePattern {

    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        rectangle.setColor("RED");
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("YELLOW");
        registry.registerShape("RECTANGLE", rectangle);
        registry.registerShape("CIRCLE", circle);

        Circle circlePrototype = (Circle) registry.getShape("CIRCLE");
        System.out.println(circlePrototype.getRadius() + " - " + circlePrototype.getColor());
    }
}
