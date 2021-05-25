package com.epi.miniprojet.dao.repository;

import com.epi.miniprojet.dao.entity.Banque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBanqueRepository extends JpaRepository<Banque ,Long> {
}
