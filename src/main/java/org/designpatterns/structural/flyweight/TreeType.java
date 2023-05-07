package org.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TreeType {

    private String name;
    private String color;
    private String texture;

    public void draw(int x, int y) {
        System.out.format("Draw %s tree on (%d,%d)\n", name, x, y);
    }
}
