package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

@Table(name = "lignecommandefournisseur" )
@EqualsAndHashCode(callSuper = true)

public class LigneCommandeClient extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private CommandeClient commandeClient;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "quantite")
    private BigDecimal quantite;

}
