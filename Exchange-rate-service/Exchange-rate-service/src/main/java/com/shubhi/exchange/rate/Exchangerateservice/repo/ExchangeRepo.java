package com.shubhi.exchange.rate.Exchangerateservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shubhi.exchange.rate.Exchangerateservice.entity.CurrencyExchangeRate;

public interface ExchangeRepo extends JpaRepository<CurrencyExchangeRate, Integer> {
    CurrencyExchangeRate findByFromAndTo(String from, String to);
}
