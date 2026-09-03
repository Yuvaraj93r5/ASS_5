package com.billing;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", "Basic", 14.0); // 4 GB extra
        BillingService service = new BillingService();

        double bill = service.calculateBill(c1);
        System.out.println("Customer: " + c1.getName());
        System.out.println("Total Bill: $" + bill);
    }
}
