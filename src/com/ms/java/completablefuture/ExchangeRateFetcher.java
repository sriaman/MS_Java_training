package com.ms.java.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ExchangeRateFetcher {

    public static void main(String[] args) {
        // Define the sources
        String[] sources = {"Source1", "Source2", "Source3", "Source4", "Source5"};

        // Initialize CompletableFuture array to store results
        CompletableFuture<Double>[] exchangeRateFutures = new CompletableFuture[sources.length];

        // Fetch exchange rates asynchronously
        for (int i = 0; i < sources.length; i++) {
            int sourceIndex = i;
            exchangeRateFutures[i] = CompletableFuture.supplyAsync(() -> fetchExchangeRate(sources[sourceIndex]));
        }

        // Get the fastest response
        CompletableFuture<Object> fastestResponseFuture = CompletableFuture.anyOf(exchangeRateFutures);

        // Aggregate all responses
        CompletableFuture<Void> allOf = CompletableFuture.allOf(exchangeRateFutures);

        try {
            // Wait for the fastest response
            Double fastestExchangeRate = (Double) fastestResponseFuture.get();
            System.out.println("Fastest Exchange Rate: " + fastestExchangeRate);

            // Wait for all responses and aggregate into JSON
            allOf.get();
            System.out.println("Aggregated Exchange Rates: " + aggregateExchangeRates(sources, exchangeRateFutures));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // Simulate fetching exchange rate from a source (replace with actual API call)
    private static Double fetchExchangeRate(String source) {
        // Simulate fetching the exchange rate (replace with actual logic)
        try {
            TimeUnit.SECONDS.sleep((long) (Math.random() * 5)); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Math.random() * 10; // Simulating exchange rate
    }

    // Aggregate exchange rates into a JSON object
    private static String aggregateExchangeRates(String[] sources, CompletableFuture<Double>[] exchangeRateFutures) {
        StringBuilder result = new StringBuilder("{");

        for (int i = 0; i < sources.length; i++) {
            String source = sources[i];
            Double exchangeRate;
            try {
                exchangeRate = exchangeRateFutures[i].get();
                result.append("\"").append(source).append("\":").append(exchangeRate);

                if (i < sources.length - 1) {
                    result.append(",");
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        result.append("}");
        return result.toString();
    }
}
