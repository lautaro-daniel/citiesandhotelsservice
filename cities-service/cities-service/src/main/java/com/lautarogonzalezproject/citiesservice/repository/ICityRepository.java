package com.lautarogonzalezproject.citiesservice.repository;

import com.lautarogonzalezproject.citiesservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {
}
