package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Ontology;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OntologyRepository extends MongoRepository<Ontology, ObjectId> {
}
