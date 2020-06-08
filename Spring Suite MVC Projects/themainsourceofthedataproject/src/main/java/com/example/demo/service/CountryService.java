package com.example.demo.service;

import java.util.List;

import com.example.demo.service.response.CountryResponse;




public interface CountryService {
	
	public List<CountryResponse> getAllCountry();
	  public CountryResponse getCountryById(Integer id);

}
