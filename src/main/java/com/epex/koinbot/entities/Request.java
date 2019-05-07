package com.epex.koinbot.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "request_portfolio")
public class Request extends CurrencyPortfolio {

    public Request(CurrencyPortfolio c) {
        super.setHighest_bid(c.getHighest_bid());
        super.setLowest_ask(c.getLowest_ask());
        super.setLast_traded_price(c.getLast_traded_price());
        super.setMin_24hrs(c.getMin_24hrs());
        super.setMax_24hrs(c.getMax_24hrs());
        super.setVol_24hrs(c.getVol_24hrs());
        super.setCurrency_full_form(c.getCurrency_full_form());
        super.setCurrency_short_form(c.getCurrency_short_form());
        super.setBaseCurrency(c.getBaseCurrency());
        super.setPer_change(c.getPer_change());
        super.setTrade_volume(c.getTrade_volume());
    }

}
