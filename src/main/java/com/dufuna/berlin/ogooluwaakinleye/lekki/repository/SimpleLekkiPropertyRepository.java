package com.dufuna.berlin.ogooluwaakinleye.lekki.repository;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    void save(LekkiProperty property);
    LekkiProperty findById(Long propertyId);
    List<LekkiProperty> findAll();
    void update(LekkiProperty property);
}
