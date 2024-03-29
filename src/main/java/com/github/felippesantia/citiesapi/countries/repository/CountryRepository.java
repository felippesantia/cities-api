package com.github.felippesantia.citiesapi.countries.repository;

import com.github.felippesantia.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
