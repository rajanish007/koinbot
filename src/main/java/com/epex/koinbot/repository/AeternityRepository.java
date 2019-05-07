package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Aeternity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AeternityRepository extends MongoRepository<Aeternity, ObjectId> {
}
