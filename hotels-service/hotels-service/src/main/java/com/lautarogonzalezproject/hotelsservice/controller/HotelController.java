package com.lautarogonzalezproject.hotelsservice.controller;

import com.lautarogonzalezproject.hotelsservice.model.Hotel;
import com.lautarogonzalezproject.hotelsservice.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService iHotelService;

    @GetMapping("/{city_id}")
    public List<Hotel> getHotelByCityId(@PathVariable Long city_id){
        return iHotelService.getHotelByCity(city_id);
    }
}
