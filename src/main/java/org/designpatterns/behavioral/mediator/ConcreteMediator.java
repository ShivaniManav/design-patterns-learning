package org.designpatterns.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
public class ConcreteMediator implements Mediator {

    ComponentA componentA;

    ComponentB componentB;

    @Override
    public void notify(String sender) {
        if(Objects.equals(sender, "A")) {
            reactOnA();
        } else if (Objects.equals(sender, "B")) {
            reactOnB();
        }
    }

    public void reactOnA() {
        System.out.println("Mediator reacting on operationA");
    }

    public void reactOnB() {
        System.out.println("Mediator reacting on operationB");
    }
}
