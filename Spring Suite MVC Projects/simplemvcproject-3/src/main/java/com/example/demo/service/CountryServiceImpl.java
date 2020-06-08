package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRespositoy;
	@Override
	public List<Country> getAllCountry() {
		
		return countryRespositoy.findAll();
	}
   public Country getCountryById(Integer id) {
	   return countryRespositoy.findById(id).get();
   }
@Override
public Country getCountryByName(String name) {
	
	return countryRespositoy.findByName(name);
}
}
