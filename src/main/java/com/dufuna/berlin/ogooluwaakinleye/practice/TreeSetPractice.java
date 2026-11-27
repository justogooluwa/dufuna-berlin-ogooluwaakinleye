package com.dufuna.berlin.ogooluwaakinleye.practice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        Set<String> properties = new TreeSet<>();

        properties.add("Lekki Duplex");
        properties.add("Ikoyi Apartment");
        properties.add("Victoria Island Bungalow");
        properties.add("Lekki Duplex");

        System.out.println("Properties: " + properties);

        System.out.println("Total Properties: " + properties.size());

        properties.remove("Ikoyi Apartment");

        System.out.println("After removal: " + properties);
    }
}