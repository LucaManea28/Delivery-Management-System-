package com.luca.Strategy;

public class FreeStrategy implements BillingStrategy {
    @Override
    public double  calculateFinalPrice(double basePrice) {
        return 0.0;
    }
}
