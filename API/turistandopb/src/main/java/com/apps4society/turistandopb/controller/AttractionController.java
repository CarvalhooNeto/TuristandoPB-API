package com.apps4society.turistandopb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;
import com.apps4society.turistandopb.services.AttractionService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/attractions")
@AllArgsConstructor
public class AttractionController {

    private final AttractionRepository AttractionRepository;
    private final AttractionService attractionService;

    @GetMapping
    public ResponseEntity<List<Attraction>> getAllAttractions() {
        return ResponseEntity.status(HttpStatus.OK).body(AttractionRepository.findAll());
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneAttraction(@PathVariable(value = "id") Long id) {
        Optional<Attraction> attractionOptional = AttractionRepository.findById(id);
        if (!attractionOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Attraction not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(attractionOptional.get());
    }
    

}
