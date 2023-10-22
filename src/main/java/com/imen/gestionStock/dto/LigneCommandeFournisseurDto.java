package com.imen.gestionStock.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;
    private List<CommandeFournisseurDto> commandeFournisseurs;
    private BigDecimal prixUnitaire;
    private BigDecimal quantite;
}
