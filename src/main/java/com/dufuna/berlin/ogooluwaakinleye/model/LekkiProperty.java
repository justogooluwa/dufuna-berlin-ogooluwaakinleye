package com.dufuna.berlin.ogooluwaakinleye.model;

import java.time.LocalDate;
import java.util.Objects;

public class LekkiProperty {
    private Long propertyId;
    private String address;
    private String type;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathtrooms;
    private int numberOfToilets;
    private String owner;
    private String description;
    private LocalDate validFrom;
    private LocalDate validTo;

    public LekkiProperty() {

    }

    public Long getPropertyID() {
        return propertyId;
    }

    public void setPropertyID(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberofBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberofBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberofSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberofSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberofKitchens() {
        return numberOfKitchens;
    }

    public void setNumberofKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberofBathtrooms() {
        return numberOfBathtrooms;
    }

    public void setNumberofBathtrooms(int numberOfBathtrooms) {
        this.numberOfBathtrooms = numberOfBathtrooms;
    }

    public int getNumberofToilets() {
        return numberOfToilets;
    }

    public void setNumberofToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return "LekkiProperty{" +
                "propertyID=" + propertyId +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberofSittingRooms=" + numberOfSittingRooms +
                ", numberOfKitchens=" + numberOfKitchens +
                ", numberOfBathtrooms=" + numberOfBathtrooms +
                ", numberOfToilets=" + numberOfToilets +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekkiProperty that = (LekkiProperty) o;
        return Objects.equals(propertyId, that.propertyId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(propertyId);
    }
}
