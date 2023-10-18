package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "utilisateur" )
@EqualsAndHashCode(callSuper = true)

public class utilisateur extends AbstractEntity  {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numTel")
    private String numTel;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private  Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;


}
