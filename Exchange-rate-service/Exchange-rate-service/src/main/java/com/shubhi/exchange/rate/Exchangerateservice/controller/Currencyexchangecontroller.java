package com.shubhi.exchange.rate.Exchangerateservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.shubhi.exchange.rate.Exchangerateservice.entity.CurrencyExchangeRate;
import com.shubhi.exchange.rate.Exchangerateservice.repo.ExchangeRepo;

@RestController
public class Currencyexchangecontroller {

    @Autowired
    ExchangeRepo exchangeRepo;

    @GetMapping("/currency-service/from/{from}/to/{to}")
    public CurrencyExchangeRate getCurrencyExchangeRate(@PathVariable String from, @PathVariable String to) {
        CurrencyExchangeRate currencyExchangeRate = exchangeRepo.findByFromAndTo(from, to);
        return currencyExchangeRate;
    }
}
