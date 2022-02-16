package com.apps4society.turistandopb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/attractions")
@AllArgsConstructor
public class AttractionController {

    private final AttractionRepository AttractionRepository;

    @GetMapping
    public @ResponseBody List<Attraction> list() {
        return AttractionRepository.findAll();
    }

    @GetMapping(value = "/api/attractions/type")
    public @ResponseBody List<Attraction> listByType(String type) {
        return AttractionRepository.findByType(type);
    }

    @GetMapping(value = "/api/attractions/name")
    public @ResponseBody List<Attraction> listByName(String name) {
        return AttractionRepository.findByName(name);
    }
    
    @GetMapping(value = "/api/attractions/description")
    public @ResponseBody List<Attraction> listByDescription(String description) {
        return AttractionRepository.findByDescription(description);
    }

    @GetMapping(value = "/api/attractions/city")
    public @ResponseBody List<Attraction> listByCity(String city) {
        return AttractionRepository.findByCity(city);
    }

    @GetMapping(value = "/api/attractions/state")
    public @ResponseBody List<Attraction> listByState(String state) {
        return AttractionRepository.findBystate(state);
    }

}
