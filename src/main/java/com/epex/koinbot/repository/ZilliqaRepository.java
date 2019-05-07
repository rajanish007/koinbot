package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Zilliqa;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZilliqaRepository extends MongoRepository<Zilliqa, ObjectId> {
}
