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
}
