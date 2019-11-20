package edu.mum.ea.project.catalogservice.dto;

import lombok.Data;

public class Apartment {
    Integer id;
    String title;
    String details;
    String imageUrl;

    public Apartment() {
    }

    public Apartment(Integer id, String title, String details, String imageUrl) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
