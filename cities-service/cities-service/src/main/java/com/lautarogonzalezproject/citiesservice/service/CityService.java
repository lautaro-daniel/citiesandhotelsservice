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

    //List<City> cityList = new ArrayList<City>();
    @Override
    public CityDTO getCitiesAndHotels(Long city_id) {
        //traer los datos de city de la db
        City city = iCityRepository.findById(city_id).orElse(null);

        //traigo datos desde api de hotel
        List<HotelDTO> hotels_list = hotelAPI.getHotelByCityId(city.getCity_id());

        //unifico datos
        CityDTO cityDTO = new CityDTO(city.getCity_id(), city.getName(), city.getContinent(),
                city.getCountry(), city.getState(), hotels_list);

        return cityDTO;
    }

    @Override
    public void saveCity(City city) {
        iCityRepository.save(city);
    }

   /* public City findcity(String name, String country){
        City getCity = this.getCity();
        cityList.add(getCity);

        for (City c : cityList){
            if (c.getName().equals(name)){
                if (c.getCountry().equals(country)){
                    return c;
                }
            }
        }
        return null;
    }*/

  /*  public City getCity(){
        City city = new City();
        return iCityRepository.findById(city.getCity_id()).orElse(null);
    }*/
}
