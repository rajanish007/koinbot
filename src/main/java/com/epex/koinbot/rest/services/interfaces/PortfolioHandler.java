package com.epex.koinbot.rest.services.interfaces;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.enums.Currency;

public interface PortfolioHandler {

    CurrencyPortfolio GeneratePortfolio(Currency currency);

}
