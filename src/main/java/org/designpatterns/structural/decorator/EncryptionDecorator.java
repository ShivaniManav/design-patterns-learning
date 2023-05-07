package org.designpatterns.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("encrypting the data provided!!");
        super.writeData(data);
    }

    @Override
    public void readData() {
        super.readData();
        System.out.println("decrypting the data provided!!");
    }
}
