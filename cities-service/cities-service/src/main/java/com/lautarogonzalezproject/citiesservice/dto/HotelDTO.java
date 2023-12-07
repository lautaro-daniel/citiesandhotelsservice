package com.lautarogonzalezproject.citiesservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {

    private Long hotel_id;
    private String name;
    private String stars;
    private Long city_id;
}
