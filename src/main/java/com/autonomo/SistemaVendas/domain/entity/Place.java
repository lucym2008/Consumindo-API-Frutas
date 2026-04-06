package com.autonomo.SistemaVendas.domain.entity;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public record Place(
        @Id Long id,
        @NotBlank
        String name,
        @NotBlank
        String slug,
        @NotBlank String city,
        @NotBlank String state,
        @CreatedDate LocalDateTime createdAt,
        @LastModifiedDate LocalDateTime updatedAt) {

    public Place withSlug(String slug) {
        return new Place(id, name, slug, city, state, createdAt, updatedAt);
    }
}