package com.example.demo.service;

import java.util.List;

import com.example.demo.service.response.CountryResponse;

public interface AggregatorService {
	
	List<CountryResponse> getAllCountries();

}
