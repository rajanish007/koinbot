package com.epex.koinbot.repository;

import com.epex.koinbot.entities.Ether;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EtherRepository extends MongoRepository<Ether, Long> {
}
