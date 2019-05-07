package com.epex.koinbot.repository;

import com.epex.koinbot.entities.DecentraLand;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DecentraLandRepository extends MongoRepository<DecentraLand, ObjectId> {
}
