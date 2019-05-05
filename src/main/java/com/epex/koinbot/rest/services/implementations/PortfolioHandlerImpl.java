package com.epex.koinbot.rest.services.implementations;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.entities.Ether;
import com.epex.koinbot.enums.Currency;
import com.epex.koinbot.repository.EtherRepository;
import com.epex.koinbot.rest.services.interfaces.KoinAPIServices;
import com.epex.koinbot.rest.services.interfaces.PortfolioHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioHandlerImpl implements PortfolioHandler {

    @Autowired
    private KoinAPIServices koinAPIServices;

    @Autowired
    private EtherRepository etherRepository;

    private final Logger logger = LoggerFactory.getLogger(PortfolioHandler.class);

    @Override
    public CurrencyPortfolio GeneratePortfolio(Currency currency) {
        CurrencyPortfolio currencyPortfolio = koinAPIServices.getCurrencyPortfolioFor(currency);
        switch (currency) {
            case ETH:
                currencyPortfolio = etherRepository.save(new Ether(currencyPortfolio));
                logger.info("Updated Ether Portfolio !");
                break;
        }
        return currencyPortfolio;
    }
}
