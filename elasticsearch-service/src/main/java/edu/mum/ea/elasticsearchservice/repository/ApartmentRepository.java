package edu.mum.ea.elasticsearchservice.repository;

import edu.mum.ea.elasticsearchservice.model.Address;
import edu.mum.ea.elasticsearchservice.model.Apartment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ApartmentRepository extends ElasticsearchRepository<Apartment,Integer> {
    List<Apartment> findApartmentsByTitle(String title);
    List<Apartment> findApartmentsByAddress(Address address);
    List<Apartment> findApartmentsCustomQuery(String title, String details,String address);
}
