package com.luca;

import com.luca.Factory.Courier;
import com.luca.Factory.CourierCreation;
import com.luca.Strategy.BillingStrategy;
import com.luca.Strategy.FreeStrategy;
import com.luca.Strategy.StandardStrategy;
import com.luca.Strategy.SuperStrategy;

public class DeliveryManager {
    public static void main(String[] args) {
        CourierCreation c = new CourierCreation();
        System.out.println("\nClose distance/ no raining/ normal client\n");
        double distance1 = 2.0;
        boolean isRaining1 = false;
        Courier courier1 = c.createCourier(distance1, isRaining1);
        BillingStrategy strategy1 = new StandardStrategy();
        processOrder(courier1, strategy1, "Strada Ceahlau, nr. 77", distance1);

        System.out.println("\nMedium distance/ raining/ free delivery\n");
        double distance2 = 4.0;
        boolean isRaining2 = true;
        Courier courier2 = c.createCourier(distance2, isRaining2);
        BillingStrategy strategy2 = new FreeStrategy();
        processOrder(courier2, strategy2, "Strada Dorului, nr. 24", distance2);

        System.out.println("\nLarge distance/ raining/ big price\n");
        double distance3 = 14;
        boolean isRaining3 = true;
        Courier courier3 = c.createCourier(distance3, isRaining3);
        BillingStrategy strategy3 = new SuperStrategy();
        processOrder(courier3, strategy3, "Strada Luptei, nr. 99", distance3);
    }

    public static void processOrder(Courier courier, BillingStrategy strategy, String destination, double distance) {
        if(courier == null) {
            System.out.println("Courier is null");
            return;
        }
        double baseCost = courier.getBaseCost();
        double finalCost = strategy.calculateFinalPrice(baseCost);
        double time = courier.calculateDeliveryTime(distance);
        System.out.println("Delivery time: " + time + " minutes");
        System.out.println("Delivery cost: " + finalCost + " $");
        courier.deliverOrder(destination);
    }
}
