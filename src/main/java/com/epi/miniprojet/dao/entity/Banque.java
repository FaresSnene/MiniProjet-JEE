package com.epi.miniprojet.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Banque {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique=true)
    private Integer code;

    private String adresse;
    private Integer nb_agences;

    @OneToMany
    private List<Client> clientList;

}
