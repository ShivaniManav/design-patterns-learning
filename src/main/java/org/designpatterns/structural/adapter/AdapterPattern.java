package org.designpatterns.structural.adapter;

public class AdapterPattern {

    public static void main(String[] args) {
        AdvancedAnalyticsClient advancedAnalyticsClient = new AdvancedAnalyticsClient();
        AnalyticsClient client = new AnalyticsAdapter(advancedAnalyticsClient);
        client.processDataAndGetResult("xmlData");
    }
}
