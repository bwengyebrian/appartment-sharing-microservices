package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.repository;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
