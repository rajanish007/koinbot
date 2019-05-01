package com.epex.koinbot.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "domain")
public class Domain {

    public Domain(String domain, boolean displayAds) {
        this.displayAds = displayAds;
        this.domain = domain;
    }

    @Id
    private long id;

    @Indexed(unique = true)
    private String domain;

    private boolean displayAds;

}
