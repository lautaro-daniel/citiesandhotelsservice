package com.lautarogonzalezproject.citiesservice.service;

import com.lautarogonzalezproject.citiesservice.dto.CityDTO;
import com.lautarogonzalezproject.citiesservice.dto.HotelDTO;
import com.lautarogonzalezproject.citiesservice.model.City;
import com.lautarogonzalezproject.citiesservice.repository.HotelAPI;
import com.lautarogonzalezproject.citiesservice.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{

    @Autowired
    private ICityRepository iCityRepository;

    @Autowired
    private HotelAPI hotelAPI;
    @Override
    public CityDTO getCitiesAndHotels(Long city_id) {
        //traer los datos de city de la db
        City city = iCityRepository.findById(city_id).orElse(null);

        //traigo datos desde api de hotel
        List<HotelDTO> hotels_list = hotelAPI.getHotelByCityId(city_id);

        //unifico datos
        CityDTO cityDTO = new CityDTO(city.getCity_id(), city.getName(), city.getContinent(),
                city.getCountry(), city.getState(), hotels_list);

        return cityDTO;
    }
}
