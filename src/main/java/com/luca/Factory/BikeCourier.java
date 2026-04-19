package com.luca.Factory;

public class BikeCourier implements Courier {
    private final double speedPerKm = 10.0;
    private final double baseCost = 5.0;

    public void deliverOrder(String destination) {
        System.out.println("Destination: " + destination);
        avoidTrafic();
    }

    public double calculateDeliveryTime(double distance) {
        return (distance / speedPerKm) * 60;
    }

    public double getBaseCost() {
        return baseCost;
    }

    private void avoidTrafic() {
        System.out.println("Your order was assigned to a bike courier!");
        System.out.println("Bike courier find a shortcut!");
    }
}
