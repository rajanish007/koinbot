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
    @Scheduled(fixedRate = 20 * 1000L)
    public void beatEvery20Seconds() {
        logger.info("BEAT 20 :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            portfolioHandler.GeneratePortfolio(null);
        } catch (Exception e) {
            logger.error("Beat 20 : Failed !\n", e.toString());
        }
    }

}
