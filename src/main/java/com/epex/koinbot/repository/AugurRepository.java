package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Augur;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AugurRepository extends MongoRepository<Augur, ObjectId> {
}
