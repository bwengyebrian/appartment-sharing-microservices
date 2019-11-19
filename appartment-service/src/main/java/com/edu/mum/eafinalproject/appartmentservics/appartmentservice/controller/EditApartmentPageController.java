package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.controller;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Category;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.ApartmentService;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EditApartmentPageController {

        @Autowired
    ApartmentService apartmentService;
        @Autowired
    CategoryService categoryService;


    @GetMapping(value = "/editPages/{apartmentId}")
    public String showEditPage(@PathVariable("apartmentId") long apartmentId, ModelMap modelMap) {
        Apartments apartments = apartmentService.getApartmentById(apartmentId);
        List<Category> categories = categoryService.getAllCategories();
        modelMap.addAttribute("categories",categories);
        modelMap.addAttribute("apartments", apartments);
        return "editApartmentPage";
    }
}
