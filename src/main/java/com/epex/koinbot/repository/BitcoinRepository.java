package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Bitcoin;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BitcoinRepository extends MongoRepository<Bitcoin, ObjectId> {
}
