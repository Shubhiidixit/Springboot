package com.shruti.exchange.calculator.Exchangecalculatorservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private int id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal ExchangeRate;
	private BigDecimal totalCalcAmount;
	
	public CurrencyConversionBean() {
	
	}
	
	public CurrencyConversionBean(int id, String from, String to, BigDecimal quantity, BigDecimal exchangeRate,
			BigDecimal totalCalcAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.ExchangeRate = exchangeRate;
		this.totalCalcAmount = totalCalcAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		ExchangeRate = exchangeRate;
	}

	public BigDecimal getTotalCalcAmount() {
		return totalCalcAmount;
	}

	public void setTotalCalcAmount(BigDecimal totalCalcAmount) {
		this.totalCalcAmount = totalCalcAmount;
	}
	
	
	
	
	
	
}