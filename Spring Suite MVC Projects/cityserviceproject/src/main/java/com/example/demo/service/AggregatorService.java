package com.example.demo.service;

import java.util.List;

import com.example.demo.service.response.CountryResponse;

public interface AggregatorService {
	public CountryResponse getCountryBiId(Integer id);
	public List<CountryResponse> getAllCountries();

}
