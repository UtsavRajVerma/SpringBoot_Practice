package com.extramarks.springboot_practice.repository;

import com.extramarks.springboot_practice.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends MongoRepository<Form,Long> {

}
