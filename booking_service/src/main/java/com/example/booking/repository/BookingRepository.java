package com.example.booking.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.booking.model.Bookings;
public interface BookingRepository extends CassandraRepository<Bookings, Integer> {


}
