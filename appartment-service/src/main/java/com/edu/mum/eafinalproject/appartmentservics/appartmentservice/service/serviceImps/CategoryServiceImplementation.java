package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.serviceImps;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Category;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.repository.CategoryRepository;
import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {
@Autowired
    CategoryRepository categoryRepository;
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
