package com.epex.koinbot.repository;

import com.epex.koinbot.entities.TrueUSD;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrueUSDRepository extends MongoRepository<TrueUSD, ObjectId> {
}
