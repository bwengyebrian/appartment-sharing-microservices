package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.serviceImps;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.repository.ApartmentRepository;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentServiceImplements implements ApartmentService {

@Autowired
    ApartmentRepository apartmentRepository;

    @Override
    public Apartments saveApartments(Apartments apartments) {
        return apartmentRepository.save(apartments);
    }

    @Override
    public Apartments updateApartments(Apartments apartments) {
        return apartmentRepository.save(apartments);
    }

    @Override
    public void deleteApartments(Apartments apartmentId) {
        apartmentRepository.delete(apartmentId);

    }

    @Override
    public Apartments getApartmentById(long apartmentId) {
        return apartmentRepository.findById(apartmentId).orElse(null);
    }

    @Override
    public List<Apartments> getAllApartments() {
        return apartmentRepository.findAll();
    }
}