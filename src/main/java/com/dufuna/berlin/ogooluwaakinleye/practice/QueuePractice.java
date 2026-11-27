package com.dufuna.berlin.ogooluwaakinleye.practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<String> propertyRequests = new LinkedList<>();

        propertyRequests.add("Request 1 - Lekki Duplex");
        propertyRequests.add("Request 2 - Ikoyi Apartment");
        propertyRequests.add("Request 3 - VI Bungalow");

        System.out.println("Queue: " + propertyRequests);

        System.out.println("Next request: " + propertyRequests.peek());

        System.out.println("Processed: " + propertyRequests.poll());

        System.out.println("Remaining requests: " + propertyRequests);
    }
}