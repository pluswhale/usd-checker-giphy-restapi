package com.pluswhale.usdchecker.client;

import com.pluswhale.usdchecker.model.ExchangeRates;

public interface OpenExchangeRatesClient {

    ExchangeRates getLatestRates(String appId);
    ExchangeRates getHistoricalRates(String date, String appId);

}
