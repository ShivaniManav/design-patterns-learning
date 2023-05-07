package org.designpatterns.structural.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("data.txt");
        DataSource encryptionDecorator = new EncryptionDecorator(fileDataSource);
        System.out.println("======================================================");
        encryptionDecorator.writeData("data");
        System.out.println("======================================================");
        encryptionDecorator.readData();
        System.out.println("======================================================");
    }
}
