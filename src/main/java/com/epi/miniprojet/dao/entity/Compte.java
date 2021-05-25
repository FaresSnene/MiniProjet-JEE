package com.epi.miniprojet.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Compte {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true)
    private Integer numCompte;

    private Date dateCreation;
    private String typeCompte;
    private Float solde;

    @ManyToOne
    private Client client;

}
