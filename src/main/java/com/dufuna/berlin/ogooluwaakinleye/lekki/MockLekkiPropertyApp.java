
package com.dufuna.berlin.ogooluwaakinleye.lekki;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;
import com.dufuna.berlin.ogooluwaakinleye.service.LekkiPropertyService;
import com.dufuna.berlin.ogooluwaakinleye.service.MockLekkiPropertyService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiPropertyService propertyService =
                new MockLekkiPropertyService();

        // Create multiple properties
        List<LekkiProperty> properties = new ArrayList<>();

        properties.add(createProperty(1L, "Lekki Phase 1, Lagos",
                "Duplex", "Ogooluwa Akinleye",
                "A beautiful five bedroom duplex"));

        properties.add(createProperty(2L, "Victoria Island, Lagos",
                "Apartment", "John Doe",
                "A modern luxury apartment"));

        properties.add(createProperty(3L, "Ikoyi, Lagos",
                "Bungalow", "Jane Doe",
                "A spacious family bungalow"));

        // Save all properties using a for loop
        for (LekkiProperty property : properties) {
            propertyService.saveProperty(property);
        }

        System.out.println("All properties saved successfully.");

        // Retrieve one property by ID
        LekkiProperty retrievedProperty =
                propertyService.getProperty(1L);

        System.out.println("\nProperty with ID 1:");
        System.out.println(retrievedProperty);

        // Update an existing property
        LekkiProperty updatedProperty = createProperty(
                1L,
                "Lekki Phase 1, Lagos",
                "Luxury Duplex",
                "Ogooluwa Akinleye",
                "An upgraded luxury five bedroom duplex"
        );

        propertyService.updateProperty(updatedProperty);

        System.out.println("\nAfter updating property ID 1:");
        System.out.println(propertyService.getProperty(1L));

        // Retrieve and display all properties
        System.out.println("\nAll Properties:");

        for (LekkiProperty property : propertyService.getProperties()) {
            System.out.println(property);
        }
    }

    private static LekkiProperty createProperty(
            Long id,
            String address,
            String type,
            String owner,
            String description) {

        LekkiProperty property = new LekkiProperty();

        property.setPropertyID(id);
        property.setAddress(address);
        property.setType(type);
        property.setNumberofBedrooms(5);
        property.setNumberofSittingRooms(2);
        property.setNumberofKitchens(1);
        property.setNumberofBathtrooms(5);
        property.setNumberofToilets(6);
        property.setOwner(owner);
        property.setDescription(description);
        property.setValidFrom(LocalDate.of(2026, 1, 1));
        property.setValidTo(LocalDate.of(2027, 1, 1));

        return property;
    }
}
