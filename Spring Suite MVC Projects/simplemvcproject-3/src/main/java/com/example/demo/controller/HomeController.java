package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;

@RestController
@RequestMapping("/countries")
public class HomeController {
@Autowired
private CountryService countryService;
    @GetMapping("/list")
    public List<Country> countryList(){
         return countryService.getAllCountry();
    }
    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable Integer id){
         return countryService.getCountryById(id);
    }
    
    @GetMapping
    public Country getCountryByName(@RequestParam String name){
         return countryService.getCountryByName(name);
    }
}
