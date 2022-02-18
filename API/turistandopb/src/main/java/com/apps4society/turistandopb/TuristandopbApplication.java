package com.apps4society.turistandopb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class TuristandopbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuristandopbApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(AttractionRepository attractiveRepository) {
		return args -> {
			attractiveRepository.deleteAll();

			Attraction c = new Attraction();
			c.setName("nome");
			c.setCity("cidade");
			c.setDescription("descricao");
			c.setState("PB");
			c.setTime("18:00");
			c.setImagemURL("imagemURL");
			c.setLatitude("latitude");
			c.setLongitude("longitude");
			c.setMoreInfo("maisInformacoes");
			c.setType("type");
			c.setCategory("category");

	

			attractiveRepository.save(c);

		};
	}

}
