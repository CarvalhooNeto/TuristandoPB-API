package com.apps4society.turistandopb.repository;

import com.apps4society.turistandopb.model.Attraction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    
}
