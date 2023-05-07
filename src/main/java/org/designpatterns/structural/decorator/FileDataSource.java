package org.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FileDataSource implements DataSource {

    private String filename;

    @Override
    public void writeData(String data) {
        System.out.format("writing data to file: %s \n", filename);
    }

    @Override
    public void readData() {
        System.out.format("reading data from file: %s \n", filename);
    }
}
