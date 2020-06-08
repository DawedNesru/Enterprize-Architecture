package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.response.CountryResponse;


@Service
public class AggregatorServiceImpl implements AggregatorService {
@Autowired
private RestTemplate restTemplate;
	@Override
	public List<CountryResponse> getAllCountries() {
		
		return restTemplate.getForObject("http://localhost:8080/countries", List.class);
	}

}
