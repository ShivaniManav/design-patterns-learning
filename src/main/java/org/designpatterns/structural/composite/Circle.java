package org.designpatterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle extends Dot {

    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("draw circle at (%d,%d) with radius=%d", getX(), getY(), getRadius()));
    }
}
