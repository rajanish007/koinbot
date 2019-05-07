package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Polymath;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PolymathRepository extends MongoRepository<Polymath, ObjectId> {
}
