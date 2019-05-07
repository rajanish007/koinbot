package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Omisego;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OmisegoRepository extends MongoRepository<Omisego, ObjectId> {
}
