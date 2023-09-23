package com.shruti.exchange.calculator.Exchangecalculatorservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.shruti.exchange.calculator.Exchangecalculatorservice.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionCalculator {
  
	
	@GetMapping("currency-conversion/from/{from}/to/{to}/{quantity}")
	public CurrencyConversionBean getConversionDetails(@PathVariable("from")String from, @PathVariable("to")String to, 
			@PathVariable("quantity") BigDecimal quantity) {

		
		Map<String, String> uriVariables = new HashMap();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity = null;
		
		try {
			 responseEntity = new RestTemplate().getForEntity("http://localhost:8003/currency-service/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariables);
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CurrencyConversionBean response = responseEntity.getBody();
		
		return new CurrencyConversionBean(response.getId(), from, to , quantity, response.getExchangeRate(),
				quantity.multiply(response.getExchangeRate()));
	
	}
}