package com.apps4society.turistandopb.services;

import java.util.List;

import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class AttractionService {
    
    private final AttractionRepository AttractionRepository;

    public Attraction save(Attraction attraction) {
        return AttractionRepository.save(attraction);
    }
    public  List<Attraction> listByType(String type) {
        return AttractionRepository.findByType(type);
    }
}
