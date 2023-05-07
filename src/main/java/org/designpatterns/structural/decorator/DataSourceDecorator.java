package org.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DataSourceDecorator implements DataSource {

    private DataSource dataSource;

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public void readData() {
        dataSource.readData();
    }
}
