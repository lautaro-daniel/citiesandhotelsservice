package com.lautarogonzalezproject.hotelsservice.service;

import com.lautarogonzalezproject.hotelsservice.model.Hotel;
import com.lautarogonzalezproject.hotelsservice.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService{

    @Autowired
    private IHotelRepository iHotelRepository;

    @Override
    public List<Hotel> getHotelByCity(Long city_id) {
        return iHotelRepository.getHotelByCityId(city_id);
    }

    @Override
    public void saveHotel(Hotel hotel) {
        iHotelRepository.save(hotel);
    }
}
