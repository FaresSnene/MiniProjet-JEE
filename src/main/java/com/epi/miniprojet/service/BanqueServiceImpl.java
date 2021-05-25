package com.epi.miniprojet.service;

import com.epi.miniprojet.dao.entity.Banque;
import com.epi.miniprojet.dao.repository.IBanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanqueServiceImpl implements IBanqueService{

    @Autowired
    private IBanqueRepository iBanqueRepository;

    @Override
    public void addBanque(Banque banque) {
        iBanqueRepository.save(banque);
    }

    @Override
    public void updateBanque(Banque banque) {
        if (banque!= null){
            Optional<Banque> banqueFromDB = iBanqueRepository.findById(banque.getId());
            if (banqueFromDB.isPresent()){
                iBanqueRepository.save(banque);
                }
        }
    }

    @Override
    public void deleteBanque(Long id) {
        if (id!= null){
            iBanqueRepository.deleteById(id);
        }
    }

    @Override
    public List<Banque> getAll() {
        return iBanqueRepository.findAll();
    }
}
