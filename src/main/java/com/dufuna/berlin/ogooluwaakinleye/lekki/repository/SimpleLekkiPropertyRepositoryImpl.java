package com.dufuna.berlin.ogooluwaakinleye.lekki.repository;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    private final Map<Long, LekkiProperty> properties = new HashMap<>();

    @Override
    public void save(LekkiProperty property) {
        properties.put(property.getPropertyId(), property);
    }

    @Override
    public LekkiProperty findById(Long propertyId) {
        return properties.get(propertyId);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(properties.values());
    }

    @Override
    public void update(LekkiProperty property) {
        if (!properties.containsKey(property.getPropertyId())) {
            throw new IllegalArgumentException(
                    "Property not found: " + property.getPropertyId()
            );
        }

        properties.put(property.getPropertyId(), property);
    }
}
