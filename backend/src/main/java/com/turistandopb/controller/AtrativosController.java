package com.turistandopb.controller;

import java.util.List;
import com.turistandopb.model.Atrativo;
import com.turistandopb.repository.AtrativoRepository;



import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/atrativos")
@Component
@AllArgsConstructor
public class AtrativosController {

    private final AtrativoRepository atrativoRepository;


    @GetMapping
    public List<Atrativo> list() {
        return atrativoRepository.findAll();// vai fazer um SELECT * da tabela de atrativos
    }

    
}
