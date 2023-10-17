package com.imen.gestionStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignecommandefournisseur" )
@EqualsAndHashCode(callSuper = true)

public class LigneCommandeFournisseur extends AbstractEntity {

  @ManyToOne
  @JoinColumn(name="idarticle")
  private Article article;

  @ManyToOne
  @JoinColumn(name = "idcommandeFournisseur")
  private List<CommandeFournisseur> commandeFournisseurs;


}
