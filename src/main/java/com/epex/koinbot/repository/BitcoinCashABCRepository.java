package com.epex.koinbot.repository;

import com.epex.koinbot.entities.BitcoinCashABC;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BitcoinCashABCRepository extends MongoRepository<BitcoinCashABC, ObjectId> {
}
