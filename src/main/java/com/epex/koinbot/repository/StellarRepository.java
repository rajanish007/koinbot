package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Stellar;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StellarRepository extends MongoRepository<Stellar, ObjectId> {
}
