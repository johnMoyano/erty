package com.example.crud.repositories;

import com.example.crud.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}
