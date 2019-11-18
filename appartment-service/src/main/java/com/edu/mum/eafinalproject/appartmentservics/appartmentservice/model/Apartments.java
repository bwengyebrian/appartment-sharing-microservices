package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "apartments")
public class Apartments {
    @PrimaryKey
    private long apartmentId;

    private String apartmentTitle;
    private String apartmentLocation;
    private String apartmentPhoneNumber;
    private double apartmentCost;
    private String apartmentImage;


    public Apartments(long apartmentId, String apartmentTitle, String apartmentLocation, String apartmentPhoneNumber, double apartmentCost, String apartmentImage) {
        this.apartmentId = apartmentId;
        this.apartmentTitle = apartmentTitle;
        this.apartmentLocation = apartmentLocation;
        this.apartmentPhoneNumber = apartmentPhoneNumber;
        this.apartmentCost = apartmentCost;
        this.apartmentImage = apartmentImage;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getApartmentTitle() {
        return apartmentTitle;
    }

    public void setApartmentTitle(String apartmentTitle) {
        this.apartmentTitle = apartmentTitle;
    }

    public String getApartmentLocation() {
        return apartmentLocation;
    }

    public void setApartmentLocation(String apartmentLocation) {
        this.apartmentLocation = apartmentLocation;
    }

    public String getApartmentPhoneNumber() {
        return apartmentPhoneNumber;
    }

    public void setApartmentPhoneNumber(String apartmentPhoneNumber) {
        this.apartmentPhoneNumber = apartmentPhoneNumber;
    }

    public double getApartmentCost() {
        return apartmentCost;
    }

    public void setApartmentCost(double apartmentCost) {
        this.apartmentCost = apartmentCost;
    }

    public String getApartmentImage() {
        return apartmentImage;
    }

    public void setApartmentImage(String apartmentImage) {
        this.apartmentImage = apartmentImage;
    }
}
