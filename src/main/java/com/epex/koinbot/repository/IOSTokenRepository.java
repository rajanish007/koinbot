package com.epex.koinbot.repository;

import com.epex.koinbot.entities.IOSToken;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IOSTokenRepository extends MongoRepository<IOSToken, ObjectId> {
}
