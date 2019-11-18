package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SaveUpdatedApartmentController {
    @Autowired
    ApartmentService apartmentService;

    @PostMapping(value = "/saveUpdatedapartment")
    public String updateApartment(@ModelAttribute("apartments") Apartments apartments, ModelMap modelMap) {
        apartmentService.updateApartments(apartments);
        List<Apartments> apartmentsList = apartmentService.getAllApartments();
        modelMap.addAttribute("apartmentsList", apartmentsList);
        return "displayApartments";
    }
}