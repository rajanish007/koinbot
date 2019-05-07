package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Aelf;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AelfRepository extends MongoRepository<Aelf, ObjectId> {
}
