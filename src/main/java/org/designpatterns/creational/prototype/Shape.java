package org.designpatterns.creational.prototype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Shape {

    private String color;

    public Shape(Shape shape) {
        this();
        this.color = shape.color;
    }

    public abstract Shape clone();
}
