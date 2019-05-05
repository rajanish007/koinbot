package com.epex.koinbot.rest.services.interfaces;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.enums.Currency;

public interface KoinAPIServices {

    CurrencyPortfolio getCurrencyPortfolioFor(Currency currency);

}
