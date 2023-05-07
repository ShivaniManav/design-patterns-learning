package org.designpatterns.creational.singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query();
    }
}
