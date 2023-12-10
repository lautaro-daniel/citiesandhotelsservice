package com.lautarogonzalezproject.citiesservice.service;

import com.lautarogonzalezproject.citiesservice.dto.CityDTO;
import com.lautarogonzalezproject.citiesservice.model.City;

public interface ICityService {

    public CityDTO getCitiesAndHotels(Long city_id);
    public void saveCity(City city);
}
