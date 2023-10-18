package com.imen.gestionStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.*;

import java.lang.Object;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@EqualsAndHashCode
@Embeddable
public class Adresse {

    @Column(name="addresse1")
    private String addresse1;
    @Column(name="addresse2")
    private String addresse2;
    @Column(name="ville")
    private String ville;
    @Column(name="codePostale")
    private String codePostale;
    @Column(name="pays")
    private String pays;





}
