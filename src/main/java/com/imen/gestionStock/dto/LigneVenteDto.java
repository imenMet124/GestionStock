package com.imen.gestionStock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class LigneVenteDto {

    private VentesDto ventes;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
