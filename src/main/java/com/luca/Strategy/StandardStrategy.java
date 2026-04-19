package com.luca.Strategy;

public class StandardStrategy implements BillingStrategy {
    @Override
    public double calculateFinalPrice(double basePrice) {
        return basePrice;
    }
}
