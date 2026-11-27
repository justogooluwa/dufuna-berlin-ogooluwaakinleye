package com.dufuna.berlin.ogooluwaakinleye.service;

import com.dufuna.berlin.ogooluwaakinleye.model.LekkiProperty;

public interface LekkiPropertyService {
    void saveProperty(LekkiProperty property);
    LekkiProperty getProperty(Long properyId);
}
