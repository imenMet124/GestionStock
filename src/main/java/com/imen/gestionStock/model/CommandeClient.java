package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

@EqualsAndHashCode(callSuper = true)

@Table(name = "commandeclient" )
public class CommandeClient extends AbstractEntity {
    @JoinColumn(name="code")
    private String code;

    @JoinColumn(name="datecommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;



}
