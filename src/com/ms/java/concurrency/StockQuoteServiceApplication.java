package com.ms.java.concurrency;

import java.util.ArrayList;
import java.util.List;

public class StockQuoteServiceApplication {
    public static void main(String[] args) {

        List<String> symbols = new ArrayList<>();
        symbols.add("AAPL");
        symbols.add("GOOGL");
        symbols.add("MSFT");

        long startTime = System.nanoTime();
        List<String> response = getResponse(symbols);
        long endTime = System.nanoTime()-startTime;

        long startTimeParallel = System.nanoTime();
        List<String> responseParallel = getResponseParallel(symbols);
        long endTimeParallel = System.nanoTime()-startTimeParallel;

        System.out.println("time elapsed : "+endTime/1000000);
        System.out.println("time elapsed parallel : "+endTimeParallel/1000000);
    }

    private static List<String> getResponseParallel(List<String> symbols) {
        return null;
    }

    private static List<String> getResponse(List<String> symbols) {

        List<String> responses = new ArrayList<>();
        for(int i=0;i<symbols.size();i++){
            String alphavantage = alphavantageResponse();
            responses.add(alphavantage);
        }
        return responses;
    }

    private static String alphavantageResponse() {
        String urlRequired = "urls";
        return urlRequired;
    }
}
