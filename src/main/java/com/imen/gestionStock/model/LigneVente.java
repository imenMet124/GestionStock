package com.imen.gestionStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignevente" )
@EqualsAndHashCode(callSuper = true)

public class LigneVente extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes ventes;

    private BigDecimal quantite;
}
