package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Ripple;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RippleRepository extends MongoRepository<Ripple, ObjectId> {
}
