package com.jap.customers;


import java.util.Comparator;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return c2.getLoyaltyPoints()- c1.getLoyaltyPoints();
    }
}
