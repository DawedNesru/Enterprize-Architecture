package com.ethio.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ethio.assignment.model.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
