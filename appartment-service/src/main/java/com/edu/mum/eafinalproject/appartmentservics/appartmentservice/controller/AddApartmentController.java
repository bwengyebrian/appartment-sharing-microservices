package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Category;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AddApartmentController {
    @Autowired
    ApartmentService apartmentService;
    @Autowired
    CategoryService categoryService;

        @GetMapping(value = "/addApartment")
            public String createApartment(Model model){
                List<Category> categories= categoryService.getAllCategories();
                model.addAttribute("categories",categories);
                model.addAttribute("apartments", new Apartments());

            return "apartmentaddPage";
        }

    @PostMapping(value = "/saveapartment")
    public String saveApartments(@ModelAttribute("apartments") Apartments apartments, ModelMap modelMap){
        Apartments apartmentsSaved =apartmentService.saveApartments(apartments);

        // make a post request or subscribe to kafka and send the apartmentsSaved
        //http:localhost:8093/elasticsearch/apartment/add

        String message = "Apartment saved with id" +apartmentsSaved.getApartmentId();
        modelMap.addAttribute("message", message);
        return "apartmentaddPage";
    }


}
