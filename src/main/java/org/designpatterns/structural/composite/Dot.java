package org.designpatterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dot implements Graphic {

    private int x;

    private int y;

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println(String.format("draw dot at (%d,%d)", x, y));
    }
}
