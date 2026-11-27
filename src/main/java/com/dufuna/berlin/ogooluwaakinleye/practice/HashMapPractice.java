package com.dufuna.berlin.ogooluwaakinleye.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<Long, String> properties = new HashMap<>();

        properties.put(1L, "Lekki Duplex");
        properties.put(2L, "Ikoyi Apartment");
        properties.put(3L, "Victoria Island Bungalow");

        System.out.println("All Properties: " + properties);

        System.out.println("Property ID 2: " + properties.get(2L));

        System.out.println("Total Properties: " + properties.size());

        properties.remove(2L);

        System.out.println("After removal: " + properties);
    }
}