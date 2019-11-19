package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apartments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long apartmentId;

    private String apartmentTitle;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId")
    private Category category;

    private String apartmentImages;
    private String apartmentDescription;
    private String apartmentPhoneNumber;
    private String apartmentWebsite;
    private String apartmentEmail;
    private String apartmentCostDescription;
    private double apartmentCost;
    private String apartmentKeyword;
    private String apartmentLocationCity;
    private String apartmentLocationStreet;
    private String apartmentLocationState;
    private int apartmentLocationZipCode;

    public Apartments(){}


    public Apartments(String apartmentTitle, String apartmentKeyword, String apartmentLocationCity, String apartmentLocationStreet, String apartmentLocationState, int apartmentLocationZipCode, String apartmentImages, String apartmentDescription, String apartmentPhoneNumber, String apartmentWebsite, String apartmentEmail, String apartmentCostDescription, double apartmentCost) {
        this.apartmentTitle = apartmentTitle;
        this.apartmentKeyword = apartmentKeyword;
        this.apartmentLocationCity = apartmentLocationCity;
        this.apartmentLocationStreet = apartmentLocationStreet;
        this.apartmentLocationState = apartmentLocationState;
        this.apartmentLocationZipCode = apartmentLocationZipCode;
        this.apartmentImages = apartmentImages;
        this.apartmentDescription = apartmentDescription;
        this.apartmentPhoneNumber = apartmentPhoneNumber;
        this.apartmentWebsite = apartmentWebsite;
        this.apartmentEmail = apartmentEmail;
        this.apartmentCostDescription = apartmentCostDescription;
        this.apartmentCost = apartmentCost;
    }



    public String getApartmentKeyword() {
        return apartmentKeyword;
    }

    public void setApartmentKeyword(String apartmentKeyword) {
        this.apartmentKeyword = apartmentKeyword;
    }

    public String getApartmentLocationCity() {
        return apartmentLocationCity;
    }

    public void setApartmentLocationCity(String apartmentLocationCity) {
        this.apartmentLocationCity = apartmentLocationCity;
    }

    public String getApartmentLocationStreet() {
        return apartmentLocationStreet;
    }

    public void setApartmentLocationStreet(String apartmentLocationStreet) {
        this.apartmentLocationStreet = apartmentLocationStreet;
    }

    public String getApartmentLocationState() {
        return apartmentLocationState;
    }

    public void setApartmentLocationState(String apartmentLocationState) {
        this.apartmentLocationState = apartmentLocationState;
    }

    public int getApartmentLocationZipCode() {
        return apartmentLocationZipCode;
    }

    public void setApartmentLocationZipCode(int apartmentLocationZipCode) {
        this.apartmentLocationZipCode = apartmentLocationZipCode;
    }

    public String getApartmentImages() {
        return apartmentImages;
    }

    public void setApartmentImages(String apartmentImages) {
        this.apartmentImages = apartmentImages;
    }

    public String getApartmentDescription() {
        return apartmentDescription;
    }

    public void setApartmentDescription(String apartmentDescription) {
        this.apartmentDescription = apartmentDescription;
    }

    public String getApartmentWebsite() {
        return apartmentWebsite;
    }

    public void setApartmentWebsite(String apartmentWebsite) {
        this.apartmentWebsite = apartmentWebsite;
    }

    public String getApartmentEmail() {
        return apartmentEmail;
    }

    public void setApartmentEmail(String apartmentEmail) {
        this.apartmentEmail = apartmentEmail;
    }

    public String getApartmentCostDescription() {
        return apartmentCostDescription;
    }

    public void setApartmentCostDescription(String apartmentCostDescription) {
        this.apartmentCostDescription = apartmentCostDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

}
