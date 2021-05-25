package com.epi.miniprojet.dao.repository;

import com.epi.miniprojet.dao.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
