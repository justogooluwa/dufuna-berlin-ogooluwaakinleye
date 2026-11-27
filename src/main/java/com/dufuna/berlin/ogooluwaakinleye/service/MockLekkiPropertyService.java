package com.dufuna.berlin.ogooluwaakinleye.service;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;
import com.dufuna.berlin.ogooluwaakinleye.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.ogooluwaakinleye.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {

    private final SimpleLekkiPropertyRepository repository;

    public MockLekkiPropertyService() {
        this.repository = new SimpleLekkiPropertyRepositoryImpl();
    }

    public MockLekkiPropertyService(SimpleLekkiPropertyRepository repository) {
        this.repository = repository;
    }

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        repository.save(property);
        return property;
    }

    @Override
    public LekkiProperty getProperty(Long propertyId) {
        return repository.findById(propertyId);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return repository.findAll();
    }

    @Override
    public void updateProperty(LekkiProperty property) {
        repository.update(property);
    }
}
