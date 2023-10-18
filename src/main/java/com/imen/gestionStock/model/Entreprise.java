package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

@Table(name = "enteprise" )
@EqualsAndHashCode(callSuper = true)

public class Entreprise extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;
    @Column(name = "codefiscale")
    private String codefiscale;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numTel")
    private String numTel;

    @Column(name = "siteWeb")
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<utilisateur> utilisateurs;



}
