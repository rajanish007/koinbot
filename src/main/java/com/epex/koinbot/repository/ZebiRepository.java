package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Zebi;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZebiRepository extends MongoRepository<Zebi, ObjectId> {
}
