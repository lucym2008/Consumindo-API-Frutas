package com.autonomo.SistemaVendas.api.dto;

import java.time.LocalDateTime;

public record PlaceRequest (
        String name, String sluge, String city, String state, LocalDateTime createAt, LocalDateTime updateAt
) {
}
