package com.imen.gestionStock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ventes" )
@EqualsAndHashCode(callSuper = true)

public class Ventes extends AbstractEntity{

    //FIXME;
    private String code;
}
