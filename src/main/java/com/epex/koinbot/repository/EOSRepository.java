package com.epex.koinbot.repository;

import com.epex.koinbot.entities.EOS;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EOSRepository extends MongoRepository<EOS, ObjectId> {
}
