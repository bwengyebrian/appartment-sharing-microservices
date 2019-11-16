package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AddApartmentController {
    @Autowired
    ApartmentService apartmentService;

        @GetMapping(value = "/addApartment")
        public String createApartment(){
            return "apartmentaddPage";
        }

    @PostMapping(value = "/saveapartment")
    public String saveApartments(@ModelAttribute("apartments") Apartments apartments, ModelMap modelMap){
        Apartments apartmentsSaved =apartmentService.saveApartments(apartments);
        String message = "Apartment saved with id" +apartmentsSaved.getApartmentId();
        modelMap.addAttribute("message", message);
        return "apartmentaddPage";
    }


}
