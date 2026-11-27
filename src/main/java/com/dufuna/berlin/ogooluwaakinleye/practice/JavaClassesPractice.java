package com.dufuna.berlin.ogooluwaakinleye.practice;

public class JavaClassesPractice {

    public static void main(String[] args) {

        // String class
        String name = "Ogooluwa";
        System.out.println("Name: " + name.toUpperCase());

        // Object class
        Object property = "Lekki Duplex";
        System.out.println("Property: " + property);

        // System class
        System.out.println("Java Practice Started");

        // Exception class
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}