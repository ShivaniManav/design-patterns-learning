package org.designpatterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("compressing the data provided!!");
        super.writeData(data);
    }

    @Override
    public void readData() {
        super.readData();
        System.out.println("de-compressing the data provided!!");
    }
}
