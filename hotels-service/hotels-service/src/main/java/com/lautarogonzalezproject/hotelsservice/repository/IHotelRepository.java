package com.lautarogonzalezproject.hotelsservice.repository;

import com.lautarogonzalezproject.hotelsservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, Long> {
}
