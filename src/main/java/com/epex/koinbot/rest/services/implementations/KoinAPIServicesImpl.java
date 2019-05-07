package com.epex.koinbot.rest.services.implementations;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.enums.Currency;
import com.epex.koinbot.rest.services.interfaces.HTTPMethods;
import com.epex.koinbot.rest.services.interfaces.KoinAPIServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KoinAPIServicesImpl implements KoinAPIServices {

    @Autowired
    private HTTPMethods http;

    private final Logger logger = LoggerFactory.getLogger(KoinAPIServices.class);

    private static final String koinURL = "https://koinex.in/api/ticker";


    @Override
    public List<CurrencyPortfolio> getCurrencyPortfolioFor(Currency currency) {
        List<CurrencyPortfolio> currencyPortfolios = new ArrayList();
        try {
            String response = http.sendGet(koinURL);
            if (currency != null) {
                currencyPortfolios.add(extractAndConvertPortfolioForCurrency(currency, response));
            } else {
                currencyPortfolios.addAll(extractAndConvertPortfolioForAllCurrency(response));
            }
            return currencyPortfolios;
        } catch (Exception e) {
            logger.error("Unable to parse response !");
            e.printStackTrace();
        }
        return currencyPortfolios;
    }

    private CurrencyPortfolio extractAndConvertPortfolioForCurrency(Currency currency, String response) throws Exception {
        JSONParser parser = new JSONParser();
        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject jsonObj = (JSONObject) parser.parse(response);
        JSONObject statsObj = (JSONObject) jsonObj.get("stats");
        JSONObject inrObj = (JSONObject) statsObj.get("inr");
        JSONObject currencyObj = (JSONObject) inrObj.get(currency.name());
        return objectMapper.readValue(currencyObj.toJSONString(), CurrencyPortfolio.class);
    }

    private List<CurrencyPortfolio> extractAndConvertPortfolioForAllCurrency(String response) throws Exception {
        List<CurrencyPortfolio> currencyPortfolios = new ArrayList();
        JSONParser parser = new JSONParser();
        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject jsonObj = (JSONObject) parser.parse(response);
        JSONObject statsObj = (JSONObject) jsonObj.get("stats");
        JSONObject inrObj = (JSONObject) statsObj.get("inr");
        for (Currency c : Currency.values()) {
            JSONObject currencyObj = (JSONObject) inrObj.get(c.name());
            currencyPortfolios.add(objectMapper.readValue(currencyObj.toJSONString(), CurrencyPortfolio.class));
        }
        return currencyPortfolios;
    }
}
