package com.example.demo.service;

import java.util.List;

import com.example.demo.service.response.CityResponse;

public interface CityService {
	List<CityResponse> getAllCities();
	List<CityResponse> getAllCitiesByCountryId(Integer countryId);
}
