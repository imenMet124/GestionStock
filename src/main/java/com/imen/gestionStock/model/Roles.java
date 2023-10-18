package com.imen.gestionStock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "roles" )
@EqualsAndHashCode(callSuper = true)

public class Roles extends AbstractEntity {

    @Column(name = "rolename")
    private  String roleName;

    @ManyToOne
    @JoinColumn (name = "idutilisateur ")
    private  utilisateur utilisateur;

}
