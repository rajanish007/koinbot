package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Status;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatusRepository extends MongoRepository<Status, ObjectId> {
}
