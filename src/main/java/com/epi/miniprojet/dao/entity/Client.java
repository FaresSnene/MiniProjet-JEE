package com.epi.miniprojet.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private String prenom;

    @Column(unique=true)
    private Integer cin;

    private Date dateNaissance;
    private String email;
    private Integer telephone;

    @OneToMany
    private List<Banque> banqueList;

    @OneToMany
    private List<Compte> compteList;
}
