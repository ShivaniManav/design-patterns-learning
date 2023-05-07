package org.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * In Prototype pattern, prototype registry stores the original objects and when someone queries
 * for these objects it returns the cloned object to the user.
 * Here our prototype is Shape and its registry is ShapeRegistry.
 */
public class ShapeRegistry {

    private Map<String, Shape> registry = new HashMap<>();

    public void registerShape(String shapeName, Shape shape) {
        registry.put(shapeName, shape);
    }

    public Shape getShape(String shapeName) {
        return registry.get(shapeName).clone();
    }
}
