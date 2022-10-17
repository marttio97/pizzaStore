package com.store;

public class Main {
    public static void main(String[] args) throws Exception {
        Store store = new PizzaStore();
        Customer customer = new Customer();

        customer.add("Pepperoni");
        customer.add("Plain");
        customer.add("Sweetcorn,Beef,Chicken");
        customer.remove("Plain");

        store.Order(customer.Order());

        customer.Order();

    }
}
