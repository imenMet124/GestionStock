package com.imen.gestionStock.dto;



import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeFournisseurDto {

    private String code;

    private Instant datecommande;

    private FournisseurDto fournisseur;


    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurList;
}
