package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Request;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<Request, ObjectId> {
}
