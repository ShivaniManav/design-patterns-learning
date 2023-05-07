package org.designpatterns.structural.bridge;

public class Blue implements Color {
    @Override
    public String getColor() {
        return "BLUE";
    }

    @Override
    public void printColor() {
        System.out.println("BLUE");
    }
}
