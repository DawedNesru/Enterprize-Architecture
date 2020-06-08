package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Country;




public interface CountryService {
	
	public List<Country> getAllCountry();
	  public Country getCountryById(Integer id);
	  public Country getCountryByName(String name);

}
