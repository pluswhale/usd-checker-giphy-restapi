package com.pluswhale.usdchecker.service;


import java.util.List;

public interface ExchangeRatesService {
    List<String> getCharCodes();

    int getKeyForTag(String charCode);

    void refreshRates();
}
