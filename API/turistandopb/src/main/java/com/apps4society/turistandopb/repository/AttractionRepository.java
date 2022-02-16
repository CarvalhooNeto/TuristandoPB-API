package com.apps4society.turistandopb.repository;

import java.util.List;

import com.apps4society.turistandopb.model.Attraction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {

    List<Attraction> findByType(String type);

    List<Attraction> findByName(String name);

    List<Attraction> findByDescription(String description);

    List<Attraction> findByCity(String city);

    List<Attraction> findBystate(String state);



    
}
