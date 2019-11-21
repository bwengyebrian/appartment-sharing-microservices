package com.example.booking.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.booking.model.Bookings;
import org.springframework.stereotype.Repository;


public interface BookingRepository extends CassandraRepository<Bookings, Integer> {


}
