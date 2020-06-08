package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.CountryService;
import com.example.demo.service.response.CountryResponse;

@RestController
public class HomeController {
@Autowired
private CountryService countryService;
    @GetMapping("/countries")
    public List<CountryResponse> countryList(){
         return countryService.getAllCountry();
    }
    @GetMapping("/countries/{id}")
    public CountryResponse getCountryById(@PathVariable Integer id){
         return countryService.getCountryById(id);
    }
}
