package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Golem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GolemRepository extends MongoRepository<Golem, ObjectId> {
}
