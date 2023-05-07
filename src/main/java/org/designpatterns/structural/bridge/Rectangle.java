package org.designpatterns.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void printShapeDetails() {
        System.out.println("RECTANGLE" + " - " + height + " - " + width + " - " + this.getColor().getColor());
    }
}
