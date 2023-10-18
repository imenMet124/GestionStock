package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "lignecommandefournisseur" )
@EqualsAndHashCode(callSuper = true)

public class LigneCommandeFournisseur extends AbstractEntity {

  @ManyToOne
  @JoinColumn(name="idarticle")
  private Article article;

  @ManyToOne
  @JoinColumn(name = "idcommandefournisseur")
  private List<CommandeFournisseur> commandeFournisseurs;

  @Column(name = "prixunitaire")
  private BigDecimal prixUnitaire;

  @Column(name = "quantite")
  private BigDecimal quantite;


}
