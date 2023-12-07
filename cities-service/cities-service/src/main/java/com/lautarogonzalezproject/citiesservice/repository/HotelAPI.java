package com.lautarogonzalezproject.citiesservice.repository;

import com.lautarogonzalezproject.citiesservice.dto.HotelDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotels-service")
public interface HotelAPI {

    @GetMapping("/hotels/{city_id}")
    public List<HotelDTO> getHotelByCityId(
            @PathVariable("city_id") Long city_id);
}
