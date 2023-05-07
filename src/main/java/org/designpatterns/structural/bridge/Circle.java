package org.designpatterns.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle extends Shape {

    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printShapeDetails() {
        System.out.println("CIRCLE" + " - " + radius +  " - " + this.getColor().getColor());
    }
}
