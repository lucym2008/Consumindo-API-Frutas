package com.autonomo.SistemaVendas.domain.repository;

import com.autonomo.SistemaVendas.domain.entity.Place;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long>, ReactiveQueryByExampleExecutor<Place> {

}