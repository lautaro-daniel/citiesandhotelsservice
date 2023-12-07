package com.lautarogonzalezproject.citiesservice.controller;

import com.lautarogonzalezproject.citiesservice.dto.CityDTO;
import com.lautarogonzalezproject.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private ICityService iCityService;

    @GetMapping("/hotels/{city_id}")
    public CityDTO getCitiesAndHotels(@PathVariable("city_id") Long city_id){
        CityDTO city = iCityService.getCitiesAndHotels(city_id);

        return city;
    }
}
