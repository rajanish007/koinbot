package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Litecoin;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LitecoinRepository extends MongoRepository<Litecoin, ObjectId> {
}
