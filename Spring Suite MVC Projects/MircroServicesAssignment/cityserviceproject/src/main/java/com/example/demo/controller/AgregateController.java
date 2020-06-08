package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AggregatorService;
import com.example.demo.service.response.CountryResponse;

@RestController
public class AgregateController {
@Autowired
private AggregatorService aggregatorService;

@GetMapping("/countries")
public List<CountryResponse> getAllCountries(){
	return aggregatorService.getAllCountries();
}
}
