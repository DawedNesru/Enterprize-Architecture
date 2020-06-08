package com.ethio.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ethio.assignment.model.Country;
import com.ethio.assignment.service.CountryService;

@RestController
public class CountryController {
	
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/")
	public String hoome() {
		return "Welcome";
	}
	@GetMapping("/countries")
	public List<Country> getAllCountry(){
		return countryService.getAllCountry();
	}

}
