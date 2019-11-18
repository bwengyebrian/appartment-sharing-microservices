package com.edu.mum.eafinalproject.appartmentservics.appartmentservice.repository;

import com.edu.mum.eafinalproject.appartmentservics.appartmentservice.model.Apartments;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends CassandraRepository<Apartments,Long> {

}
