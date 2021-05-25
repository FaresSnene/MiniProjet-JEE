package com.epi.miniprojet.service;


import com.epi.miniprojet.dao.entity.Compte;
import com.epi.miniprojet.dao.repository.ICompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteServiceImpl implements ICompteService {

    @Autowired
    private ICompteRepository iCompteRepository;

    @Override
    public void addCompte(Compte compte) {
        iCompteRepository.save(compte);
    }

    @Override
    public void updateCompte(Compte compte) {
        if(compte!= null){
            Optional<Compte> compteFromDB = iCompteRepository.findById(compte.getId());
            if (compteFromDB.isPresent()){
                iCompteRepository.save(compte);
            }
        }
    }

    @Override
    public void deleteCompte(Long id) {
        if (id!= null){
            iCompteRepository.deleteById(id);
        }
    }

    @Override
    public List<Compte> getAll() {
        return iCompteRepository.findAll();
    }
}
