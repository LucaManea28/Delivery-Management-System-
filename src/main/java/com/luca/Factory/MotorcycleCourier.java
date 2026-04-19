package com.luca.Factory;

public class MotorcycleCourier implements Courier {
    private final double speedPerKm = 25.0;
    private final double baseCost = 10.0;

    public void deliverOrder(String destination) {
        System.out.println("Destination: " + destination);
        helmetColor();
    }

    @Override
    public double calculateDeliveryTime(double distance) {
        return (distance / speedPerKm) * 60 + 5.0;
    }

    public double getBaseCost() {
        return baseCost;
    }

    private void helmetColor(){
        System.out.println("Your order was assigned to a motorcycle courier!");
        System.out.println("Motorcycle courier wear a red helmet!");
    }
}
