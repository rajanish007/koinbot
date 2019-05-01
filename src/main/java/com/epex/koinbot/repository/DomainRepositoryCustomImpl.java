package com.epex.koinbot.repository;

import com.epex.koinbot.domain.Domain;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class DomainRepositoryCustomImpl implements DomainRepositoryCustom{

    @Autowired
    MongoTemplate mongoTemplate;

    public long updateDomain(String domain, boolean displayAds) {

        Query query = new Query(Criteria.where("domain").is(domain));
        Update update = new Update();
        update.set("displayAds", displayAds);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Domain.class);

        if (result != null)
            return result.getModifiedCount();
        else
            return 0;

    }

}
