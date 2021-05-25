package com.epi.miniprojet.dao.repository;

import com.epi.miniprojet.dao.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompteRepository extends JpaRepository<Compte, Long> {
}
