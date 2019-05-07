package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Tron;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TronRepository extends MongoRepository<Tron, ObjectId> {
}
