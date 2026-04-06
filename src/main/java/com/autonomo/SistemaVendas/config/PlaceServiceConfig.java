package com.autonomo.SistemaVendas.config;

import com.autonomo.SistemaVendas.domain.repository.PlaceRepository;
import com.autonomo.SistemaVendas.domain.services.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@Configuration
@EnableR2dbcAuditing // Para preencher o createdAt e updatedAt
public class PlaceServiceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository) {
        return new PlaceService(placeRepository);
    }
}

