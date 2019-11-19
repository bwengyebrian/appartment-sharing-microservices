package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;
    private String categoryName;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Apartments> apartments = new ArrayList<>();



    public List<Apartments> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartments> apartments) {
        this.apartments = apartments;
    }


    public Category(String categoryName) {
        this.categoryName = categoryName;
    }


    public Category(){}

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
