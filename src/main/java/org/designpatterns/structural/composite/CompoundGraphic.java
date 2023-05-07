package org.designpatterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in terms of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
 * <p>
 * This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.
 * <p>
 * Here the nested object is Circle and Dot which makes a tree with Dot as a leaf node and Circle as a container.
 * Here the Composite class is CompoundGraphic class which has list of children which will have container or leaf components and this composite class which also implement component class and will act as a root component from which we can traverse the whole component tree.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CompoundGraphic implements Graphic {

    public List<Graphic> children = new ArrayList<>();

    public void add(Graphic graphic) {
        children.add(graphic);
    }

    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        for(Graphic child: children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for(Graphic child: children) {
            child.draw();
        }
    }
}
