package com.epex.koinbot.rest.services.interfaces;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.enums.Currency;

import java.util.List;

public interface KoinAPIServices {

    List<CurrencyPortfolio> getCurrencyPortfolioFor(Currency currency);

}
