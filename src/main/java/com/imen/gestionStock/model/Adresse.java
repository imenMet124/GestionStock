package com.imen.gestionStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import java.lang.Object;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

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
