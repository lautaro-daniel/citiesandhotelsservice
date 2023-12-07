package com.lautarogonzalezproject.hotelsservice.service;

import com.lautarogonzalezproject.hotelsservice.model.Hotel;

import java.util.List;

public interface IHotelService {

    List<Hotel> getHotelByCity(Long city_id);

    public void saveHotel(Hotel hotel);
}
