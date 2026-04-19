package com.luca.Factory;

public interface Courier {
    void deliverOrder(String destination);
    double calculateDeliveryTime(double distance);
    double getBaseCost();
}
