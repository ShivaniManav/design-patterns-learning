package org.designpatterns.behavioral.mediator;

public class MediatorPattern {

    public static void main(String[] args) {
        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();
        ConcreteMediator concreteMediator = new ConcreteMediator(componentA, componentB);
        componentA.setMediator(concreteMediator);
        componentB.setMediator(concreteMediator);
        componentA.operationA();
        componentB.operationB();
    }
}
