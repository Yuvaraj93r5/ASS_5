package com.billing;

public class BillingService {

    public double calculateBill(Customer customer) {
        double baseRate = 0.0;
        double dataLimit = 0.0;
        double extraRatePerGB = 5.0;

        switch (customer.getPlanType()) {
            case "basic":
                baseRate = 10.0;
                dataLimit = 10.0; // 10 GB limit
                break;
            case "standard":
                baseRate = 25.0;
                dataLimit = 50.0; // 50 GB limit
                break;
            case "premium":
                baseRate = 50.0;
                dataLimit = 150.0; // 150 GB limit
                break;
            default:
                throw new IllegalArgumentException("Invalid plan type");
        }

        double totalBill = baseRate;
        if (customer.getDataUsed() > dataLimit) {
            double extraData = customer.getDataUsed() - dataLimit;
            totalBill += extraData * extraRatePerGB;
        }

        return totalBill;
    }
}
