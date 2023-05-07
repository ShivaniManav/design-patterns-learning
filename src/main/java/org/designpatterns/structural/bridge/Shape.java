package org.designpatterns.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
 * <p>
 * This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent of interface implementer classes. Both types of classes can be altered structurally without affecting each other.
 * <p>
 * Here we have a Shape class which is a concrete class bridging/linking to classes implemented by Color interface.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Shape {

    private Color color;

    public abstract void printShapeDetails();
}
