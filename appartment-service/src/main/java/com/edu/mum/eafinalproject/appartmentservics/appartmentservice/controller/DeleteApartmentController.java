package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


    @Controller
    public class DeleteApartmentController {
        @Autowired
        ApartmentService apartmentService;

        @GetMapping(value = "/deleteapartments/{apartmentId}")
        public String deleteApartment(@PathVariable("apartmentId") long apartmentId, ModelMap modelMap){
            Apartments apartments = apartmentService.getApartmentById(apartmentId);
            apartmentService.deleteApartments(apartments);
            List<Apartments> apartmentsList=apartmentService.getAllApartments();
            modelMap.addAttribute("apartmentsList",apartmentsList);
            return "displayApartments";
        }
    }