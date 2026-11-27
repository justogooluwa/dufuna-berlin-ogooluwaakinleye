package com.dufuna.berlin.ogooluwaakinleye.service;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;
import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);

    LekkiProperty getProperty(Long propertyId);

    List<LekkiProperty> getProperties();

    void updateProperty(LekkiProperty property);
}
