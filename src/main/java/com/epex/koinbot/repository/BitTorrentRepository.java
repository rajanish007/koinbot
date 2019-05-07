package com.epex.koinbot.repository;

import com.epex.koinbot.entities.BitTorrent;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BitTorrentRepository extends MongoRepository<BitTorrent, ObjectId> {
}
