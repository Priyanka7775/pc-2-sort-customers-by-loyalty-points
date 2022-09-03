package com.jap.customers;


import java.util.*;

public class CustomerService {

    // This method returns the customer's loyalty points in sorted order
public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){
    List<Integer> integerList=new ArrayList<>();
    Collections.sort(customerList,loyaltyPointComparator);
    Iterator<Customer>iterator=customerList.iterator();
    while (iterator.hasNext()){
        integerList.add(iterator.next().getLoyaltyPoints());
    }


    return integerList;
}

    public static void main(String[] args) {
        CustomerService customerService=new CustomerService();
        List<Customer> customerList=Arrays.asList( new Customer(1101,"Tara","Female",true,"Austin",123),
                new Customer(5242,"Sam","Male",false,"Denver",112),
                new Customer(8965,"Abbie","Female",false,"Chicago",345),
                new Customer(3354,"Michelle","Female",false,"Portland",234),
                new Customer(2212,"Mary","Female",true,"New Orleans",456),
                new Customer(4542,"John","Male",false,"Seattle",265),
                new Customer(1119,"Trevor","Male",false,"Boston",101));

        System.out.println(customerService.getListOfCustomersSortedByLoyaltyPoints(customerList, new LoyaltyPointComparator()));

    }

}
