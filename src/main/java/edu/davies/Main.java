package edu.davies;

import edu.davies.crmapp.model.Customer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Customer[] cn = {new Customer(1000, "James Bond"), new Customer(1001, "Wabuluka")};
        Arrays.stream(cn).forEach(System.out::println);
    }
}