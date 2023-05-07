package org.designpatterns.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class ComponentB {

    private static final String B = "B";

    Mediator mediator;

    public void operationB() {
        System.out.println("ComponentB :: operationB :: start");
        mediator.notify(B);
        System.out.println("ComponentB :: operationB :: end");
    }
}
