package com.luca.Factory;

public class CourierCreation {
    public Courier createCourier(double distance, boolean isRaining) {
        if (distance <= 0) {
            System.out.println("You need to enter a positive distance!");
            return null;
        }
        Courier c = null;
        if (isRaining) {
            if (distance < 5) {
                c = new MotorcycleCourier();
            } else if (distance >= 5) {
                c = new CarCourier();
            }
        } else {
            if (distance < 3) {
                c = new BikeCourier();
            } else if (distance >= 3 && distance <= 5) {
                c = new MotorcycleCourier();
            } else {
                c = new CarCourier();
            }
        }
        return c;
    }
}
