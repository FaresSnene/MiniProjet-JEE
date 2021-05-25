package com.epi.miniprojet.service;

import com.epi.miniprojet.dao.entity.Banque;

import java.util.List;

public interface IBanqueService {
    void addBanque(Banque banque);

    void updateBanque(Banque banque);

    void deleteBanque(Long id);

    List<Banque> getAll();
}
