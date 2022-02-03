package com.turistandopb.repository;

import com.turistandopb.model.Atrativo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtrativoRepository extends JpaRepository<Atrativo,Long> {
    
}
