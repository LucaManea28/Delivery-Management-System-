package com.luca.Factory;

public class CarCourier implements Courier {
    private final double speedPerKm = 40.0;
    private final double baseCost = 15.0;

    public void deliverOrder(String destination) {
        System.out.println("Destination: " + destination);
        hasTrunk();
    }

    public double calculateDeliveryTime(double distance) {
        return (distance / speedPerKm) * 60 + 10.0;
    }

    public double getBaseCost() {
        return baseCost;
    }

    private void hasTrunk(){
        System.out.println("Your order was assigned to a car courier!");
        System.out.println("Large packages were stored in the trunk!");
    }
}
