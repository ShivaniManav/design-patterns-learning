package org.designpatterns.creational.prototype;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rectangle extends Shape {

    private int width;

    private int height;

    private Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
