package com.epex.koinbot.repository;

import com.epex.koinbot.entities.BitcoinCashSV;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BitcoinCashSVRepository extends MongoRepository<BitcoinCashSV, ObjectId> {
}
