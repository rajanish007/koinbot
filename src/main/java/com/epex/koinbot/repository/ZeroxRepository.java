package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Zerox;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZeroxRepository extends MongoRepository<Zerox, ObjectId> {
}
