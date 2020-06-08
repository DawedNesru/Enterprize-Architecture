package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.response.CountryResponse;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRespositoy;
	@Override
	public List<CountryResponse> getAllCountry() {
		
		return countryRespositoy.findAll().stream().map(c -> new CountryResponse(c.getCountry_id(), c.getName())).collect(Collectors.toList());
	}
   public CountryResponse getCountryById(Integer id) {
	   Country countryResp = countryRespositoy.findById(id).get();
	   return new CountryResponse(countryResp.getCountry_id(), countryResp.getName());
   }
   
//   public CountryResponse getCountryByName(String name) {
//	   Country countryResp = countryRespositoy.findByName(name).get();
//	   return new CountryResponse(countryResp.getCountry_id(), countryResp.getName());
//   }
}
