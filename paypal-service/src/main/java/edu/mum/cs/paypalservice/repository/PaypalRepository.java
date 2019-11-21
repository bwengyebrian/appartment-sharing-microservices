package edu.mum.cs.paypalservice.repository;

import edu.mum.cs.paypalservice.model.Paypal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaypalRepository extends MongoRepository<Paypal, Long> {

}
