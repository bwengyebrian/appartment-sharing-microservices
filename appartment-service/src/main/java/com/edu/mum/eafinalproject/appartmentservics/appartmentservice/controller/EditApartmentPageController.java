package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EditApartmentPageController {

        @Autowired
    ApartmentService apartmentService;


    @GetMapping(value = "/editPages/{apartmentId}")
    public String showEditPage(@PathVariable("apartmentId") long apartmentId, ModelMap modelMap) {
        Apartments apartments = apartmentService.getApartmentById(apartmentId);
        modelMap.addAttribute("apartments", apartments);
        return "editApartmentPage";
    }
}
