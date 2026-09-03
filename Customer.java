package com.billing;

public class Customer {
    private String name;
    private String planType; // basic, standard, premium
    private double dataUsed; // in GB

    public Customer(String name, String planType, double dataUsed) {
        this.name = name;
        this.planType = planType.toLowerCase();
        this.dataUsed = dataUsed;
    }

    public String getName() { return name; }
    public String getPlanType() { return planType; }
    public double getDataUsed() { return dataUsed; }
}
