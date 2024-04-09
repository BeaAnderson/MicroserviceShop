package com.beacodeart.Productservice.repository;

import com.beacodeart.Productservice.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{
    
}
