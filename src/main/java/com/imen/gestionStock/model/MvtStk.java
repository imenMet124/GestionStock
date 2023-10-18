package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "mvtstk" )
@EqualsAndHashCode(callSuper = true)

public class MvtStk extends AbstractEntity {

   @Column(name = "datemvt")
   private Instant dateMvt;

   @Column(name = "quantite")
   private BigDecimal quantite;
    @Column(name = "typemvt")
    private Instant typeMvt;

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;


}
