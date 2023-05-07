package org.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * The adapter will have the service class object and will internally call
 * its methods after applying some transformation to the data.
 */
@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsAdapter implements AnalyticsClient {

    private AdvancedAnalyticsClient advancedAnalyticsClient;

    @Override
    public void processDataAndGetResult(String xmlData) {
        String jsonData = convertXmlToJson(xmlData);
        advancedAnalyticsClient.processDataWithAdvancedFeatures(jsonData);
        System.out.println("Data analysis completed using advanced algorithms!!");
    }

    public String convertXmlToJson(String xmlData) {
        System.out.println("Converting xml data to json data");
        return "jsonData";
    }
}
