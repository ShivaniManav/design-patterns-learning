package org.designpatterns.creational.prototype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Circle extends Shape {

    private int radius;

    private Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
