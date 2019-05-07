package com.epex.koinbot.rest.services.interfaces;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.enums.Currency;

import java.util.List;

public interface PortfolioHandler {

    List<CurrencyPortfolio> GeneratePortfolio(Currency currency);

}
