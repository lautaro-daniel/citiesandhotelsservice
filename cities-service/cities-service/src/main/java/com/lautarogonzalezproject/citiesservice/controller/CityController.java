package com.lautarogonzalezproject.citiesservice.controller;

import com.lautarogonzalezproject.citiesservice.dto.CityDTO;
import com.lautarogonzalezproject.citiesservice.model.City;
import com.lautarogonzalezproject.citiesservice.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private ICityService iCityService;

    @GetMapping("/hotels/{city_id}")
    public CityDTO getCitiesAndHotels(@PathVariable("city_id") Long city_id){

        return iCityService.getCitiesAndHotels(city_id);
    }

    @PostMapping("/save")
    public String saveCity(@RequestBody City city){
        iCityService.saveCity(city);

        return "City saved";
    }
}
