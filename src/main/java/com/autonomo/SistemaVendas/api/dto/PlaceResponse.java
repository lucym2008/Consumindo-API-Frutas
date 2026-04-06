package com.autonomo.SistemaVendas.api.dto;

import java.time.LocalDateTime;

public record PlaceResponse (
        String name, String sluge, String state, String stated, LocalDateTime createAt, LocalDateTime updateAt
) {
}
