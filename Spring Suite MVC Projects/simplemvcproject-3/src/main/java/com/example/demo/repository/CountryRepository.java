package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.*;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
public Country findByName(String name);
//public List<City> findAllCitiesByCountryId(Integer id);
}
