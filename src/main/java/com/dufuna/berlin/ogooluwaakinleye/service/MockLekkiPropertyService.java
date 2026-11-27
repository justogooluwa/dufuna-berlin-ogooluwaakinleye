package com.dufuna.berlin.ogooluwaakinleye.service;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {

    private LekkiProperty property;

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        this.property = property;
    }

    @Override
    public LekkiProperty getProperty(Long properyId) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return property;
    }
}