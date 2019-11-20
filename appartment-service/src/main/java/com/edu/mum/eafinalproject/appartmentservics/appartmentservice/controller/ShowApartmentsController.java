package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShowApartmentsController {

    @Autowired
    ApartmentService apartmentService;
    @GetMapping(value = "/displayApartments")
    public String displayApartments(ModelMap modelMap) {
        List<Apartments> apartmentsList = apartmentService.getAllApartments();
        modelMap.addAttribute("apartmentsList", apartmentsList);
        return "displayApartments";
    }
}
