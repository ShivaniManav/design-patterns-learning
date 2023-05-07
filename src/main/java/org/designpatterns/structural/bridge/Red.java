package org.designpatterns.structural.bridge;

public class Red implements Color {
    @Override
    public String getColor() {
        return "RED";
    }

    @Override
    public void printColor() {
        System.out.println("RED");
    }
}
