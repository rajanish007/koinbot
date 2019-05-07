package com.epex.koinbot.repository;

import com.epex.koinbot.entities.BasicAttentionToken;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BasicAttentionTokenRepository extends MongoRepository<BasicAttentionToken, ObjectId> {
}
