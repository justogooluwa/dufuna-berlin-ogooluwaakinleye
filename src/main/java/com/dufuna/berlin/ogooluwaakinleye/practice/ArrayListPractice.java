package com.dufuna.berlin.ogooluwaakinleye.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<String> properties = new ArrayList<>();

        properties.add("Lekki Duplex");
        properties.add("Ikoyi Apartment");
        properties.add("Victoria Island Bungalow");

        System.out.println("All Properties:");

        for (String property : properties) {
            System.out.println(property);
        }

        System.out.println("Total Properties: " + properties.size());

        properties.remove("Ikoyi Apartment");

        System.out.println("After removal: " + properties);
    }
}