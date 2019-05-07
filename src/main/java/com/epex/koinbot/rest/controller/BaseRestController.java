package com.epex.koinbot.rest.controller;

import com.epex.koinbot.entities.CurrencyPortfolio;
import com.epex.koinbot.enums.Currency;
import com.epex.koinbot.rest.services.interfaces.PortfolioHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@Controller
@RequestMapping("/base")
public class BaseRestController {

    @Autowired
    private PortfolioHandler portfolioHandler;

    @RequestMapping(method = RequestMethod.POST, value = "/generate")
    @ResponseBody
    public List<CurrencyPortfolio> generatePortfolio(@RequestParam(name = "type", required = false) Currency currency) {
        List<CurrencyPortfolio> currencyPortfolio;
        try {
            currencyPortfolio = portfolioHandler.GeneratePortfolio(currency);
        } catch (Exception e) {
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, e.toString());
        }
        return currencyPortfolio;
    }

}
