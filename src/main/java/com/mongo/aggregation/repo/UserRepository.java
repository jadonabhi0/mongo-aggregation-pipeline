package com.mongo.aggregation.repo;


import com.mongo.aggregation.modal.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
