package com.imen.gestionStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "ventes" )
@EqualsAndHashCode(callSuper = true)

public class Ventes extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private String dateVente;

    @Column(name = "commentaire")
    private String commentaire;


}
