package com.lautarogonzalezproject.citiesservice.service;

import com.lautarogonzalezproject.citiesservice.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesAndHotels(Long city_id);
}
