package com.epex.koinbot.repository;

import com.epex.koinbot.entities.NucleusVision;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NucleusVisionRepository extends MongoRepository<NucleusVision, ObjectId> {
}
