package com.epi.miniprojet.service;


import com.epi.miniprojet.dao.entity.Compte;

import java.util.List;

public interface ICompteService {
    void addCompte(Compte compte);

    void updateCompte(Compte compte);

    void deleteCompte(Long id);

    List<Compte> getAll();
}
