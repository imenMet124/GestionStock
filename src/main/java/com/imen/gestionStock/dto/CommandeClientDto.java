package com.imen.gestionStock.dto;

import com.imen.gestionStock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeClientDto {

    private String code;
    private Instant dateCommande;
    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;
}
