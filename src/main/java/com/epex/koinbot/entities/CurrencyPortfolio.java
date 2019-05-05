package com.epex.koinbot.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CurrencyPortfolio {

    @Id
    private long id;

    private BigDecimal highest_bid;

    private BigDecimal lowest_ask;

    private BigDecimal last_traded_price;

    private BigDecimal min_24hrs;

    private BigDecimal max_24hrs;

    private BigDecimal vol_24hrs;

    private String currency_full_form;

    private String currency_short_form;

    private String baseCurrency;

    private BigDecimal per_change;

    private BigDecimal trade_volume;

}
