package com.imen.gestionStock.dto;

import lombok.Builder;
import lombok.Data;


import java.util.List;
@Builder
@Data
public class EntrepriseDto {

    private String description;


    private AdresseDto adresse;

    private String photo;
    private String codefiscale;

    private String mail;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurs;
}
