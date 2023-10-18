package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "lignevente" )
@EqualsAndHashCode(callSuper = true)

public class LigneVente extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes ventes;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;


}
