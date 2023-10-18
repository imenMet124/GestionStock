package com.imen.gestionStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {

    private String code;

    private String dateVente;

    private String commentaire;
}
