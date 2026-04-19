package com.luca.Strategy;

public class SuperStrategy implements BillingStrategy {
    @Override
    public double calculateFinalPrice(double basePrice) {
        return basePrice * 2;
    }
}
