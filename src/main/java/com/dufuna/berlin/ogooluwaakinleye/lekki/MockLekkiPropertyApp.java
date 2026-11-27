package com.dufuna.berlin.ogooluwaakinleye.lekki;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;
import com.dufuna.berlin.ogooluwaakinleye.service.LekkiPropertyService;
import com.dufuna.berlin.ogooluwaakinleye.service.MockLekkiPropertyService;

import java.time.LocalDate;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiProperty property = new LekkiProperty();

        property.setPropertyID(1L);
        property.setAddress("Lekki Phase 1, Lagos");
        property.setType("Duplex");
        property.setNumberofBedrooms(5);
        property.setNumberofSittingRooms(2);
        property.setNumberofKitchens(1);
        property.setNumberofBathtrooms(5);
        property.setNumberofToilets(6);
        property.setOwner("Ogooluwa Akinleye");
        property.setDescription("A beautiful five bedroom duplex");
        property.setValidFrom(LocalDate.of(2026, 1, 1));
        property.setValidTo(LocalDate.of(2027,1,1));

        LekkiPropertyService propertyService =
                new MockLekkiPropertyService();

        propertyService.saveProperty(property);

        LekkiProperty retrievedProperty = propertyService.getProperty(1L);

        System.out.println(retrievedProperty);
    }
}