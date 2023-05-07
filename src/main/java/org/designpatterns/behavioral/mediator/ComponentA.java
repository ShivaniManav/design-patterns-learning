package org.designpatterns.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class ComponentA {

    private static final String A = "A";

    Mediator mediator;

    public void operationA() {
        System.out.println("ComponentA :: operationA :: start");
        mediator.notify(A);
        System.out.println("ComponentA :: operationA :: end");
    }
}
