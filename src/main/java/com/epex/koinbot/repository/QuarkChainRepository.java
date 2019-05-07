package com.epex.koinbot.repository;

import com.epex.koinbot.entities.QuarkChain;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuarkChainRepository extends MongoRepository<QuarkChain, ObjectId> {
}
