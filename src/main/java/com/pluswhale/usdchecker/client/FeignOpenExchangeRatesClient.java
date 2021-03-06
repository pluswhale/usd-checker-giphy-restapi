package com.pluswhale.usdchecker.client;

import com.pluswhale.usdchecker.model.ExchangeRates;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "OERClient", url = "${openexchangerates.url.general}")
public interface FeignOpenExchangeRatesClient extends OpenExchangeRatesClient {
    @Override
    @GetMapping("/latest.json")
    ExchangeRates getLatestRates(
            @RequestParam("app_id") String appId
    );

    @Override
    @GetMapping("/historical/{date}.json")
    ExchangeRates getHistoricalRates(
            @PathVariable String date,
            @RequestParam("app_id") String appId
    );

}
