package com.store;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();

        customer.add("Pepperoni");
        customer.add("Plain");
        customer.add("Sweetcorn,Beef,Chicken");
        customer.remove("Plain");

        customer.Order();

    }
}
