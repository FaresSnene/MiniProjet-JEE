package com.epi.miniprojet.service;

import com.epi.miniprojet.dao.entity.Client;

import java.util.List;

public interface IClientService {
    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(Long id);

    List<Client> getAll();
}
