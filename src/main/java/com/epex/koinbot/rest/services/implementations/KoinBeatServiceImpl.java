package com.epex.koinbot.rest.services.implementations;

import com.epex.koinbot.rest.services.interfaces.KoinBeatService;
import com.epex.koinbot.rest.services.interfaces.PortfolioHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class KoinBeatServiceImpl implements KoinBeatService {

    private static final Logger logger = LoggerFactory.getLogger(KoinBeatService.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Autowired
    private PortfolioHandler portfolioHandler;

    @Override
    //@Scheduled(fixedRate = 20 * 1000L)
    public void beatEvery20Seconds() {
        logger.info("BEAT 20 :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            portfolioHandler.GeneratePortfolio(null);
        } catch (Exception e) {
            logger.error("Beat 20 : Failed !\n", e.toString());
        }
    }

    @Override
    //@Scheduled(fixedRate = 30 * 1000L)
    public void beatEvery30Seconds() {
        logger.info("BEAT 30 :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            portfolioHandler.GeneratePortfolio(null);
        } catch (Exception e) {
            logger.error("Beat 30 : Failed !\n", e.toString());
        }
    }

    @Override
    //@Scheduled(fixedRate = 60 * 1000L)
    public void beatEvery60Seconds() {
        logger.info("BEAT 60 :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            portfolioHandler.GeneratePortfolio(null);
        } catch (Exception e) {
            logger.error("Beat 60 : Failed !\n", e.toString());
        }
    }

    @Override
    @Scheduled(fixedRate = 120 * 1000L)
    public void beatEvery2Minutes() {
        logger.info("BEAT 120 :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            portfolioHandler.GeneratePortfolio(null);
        } catch (Exception e) {
            logger.error("Beat 120 : Failed !\n", e.toString());
        }
    }

    @Override
    //@Scheduled(fixedRate = 1000 * 1000L)
    public void beatEvery5Minutes() {
        logger.info("BEAT 1000 :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            portfolioHandler.GeneratePortfolio(null);
        } catch (Exception e) {
            logger.error("Beat 1000 : Failed !\n", e.toString());
        }
    }

}
