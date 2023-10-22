package com.imen.gestionStock.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numTel;
    private EntrepriseDto entreprise;
    private List<RolesDto> roles;
}
