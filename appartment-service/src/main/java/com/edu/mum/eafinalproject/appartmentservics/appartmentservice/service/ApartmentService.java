package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;

import java.util.List;

public interface ApartmentService {

    Apartments saveApartments(Apartments apartments);
    Apartments updateApartments(Apartments apartments);
    void deleteApartments(Apartments apartmentId);
    Apartments getApartmentById(long apartmentId);
    List<Apartments> getAllApartments();

}
