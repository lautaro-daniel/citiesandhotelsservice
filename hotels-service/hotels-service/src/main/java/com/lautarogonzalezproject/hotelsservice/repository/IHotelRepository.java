package com.lautarogonzalezproject.hotelsservice.repository;

import com.lautarogonzalezproject.hotelsservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Long> {

    @Query("SELECT h FROM Hotel h WHERE h.city_id = :city_id")
    List<Hotel> getHotelByCityId(Long city_id);
}
