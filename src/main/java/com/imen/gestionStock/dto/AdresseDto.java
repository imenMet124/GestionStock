package com.imen.gestionStock.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {
    private String addresse1;
    private String addresse2;
    private String ville;
    private String codePostale;
    private String pays;
}
