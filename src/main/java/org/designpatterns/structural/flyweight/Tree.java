package org.designpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tree {

    public int x;
    public int y;
    TreeType type;

    public void draw() {
        type.draw(x, y);
    }
}
