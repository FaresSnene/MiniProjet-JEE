package com.epi.miniprojet.service;

import com.epi.miniprojet.dao.entity.Banque;
import com.epi.miniprojet.dao.entity.Client;
import com.epi.miniprojet.dao.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepository iClientRepository;

    @Override
    public void addClient(Client client) {
        iClientRepository.save(client);
    }

    @Override
    public void updateClient(Client client) {
        if (client!= null){
            Optional<Client> clientFromDB = iClientRepository.findById(client.getId());
            if (clientFromDB.isPresent()){
                iClientRepository.save(client);
            }
        }
    }

    @Override
    public void deleteClient(Long id) {
        if(id!= null){
            iClientRepository.deleteById(id);
        }
    }

    @Override
    public List<Client> getAll() {
        return iClientRepository.findAll();
    }
}
