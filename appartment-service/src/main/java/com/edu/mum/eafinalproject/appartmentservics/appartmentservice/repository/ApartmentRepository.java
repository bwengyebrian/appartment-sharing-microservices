package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.repository;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartments,Long> {

}
