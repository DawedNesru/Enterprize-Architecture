package com.ethio.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ethio.assignment.model.Country;
import com.ethio.assignment.repository.CountryRepository;


@Service
@Transactional
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRespositoy;
	@Override
	public List<Country> getAllCountry() {
		
		return countryRespositoy.findAll();
	}

}
