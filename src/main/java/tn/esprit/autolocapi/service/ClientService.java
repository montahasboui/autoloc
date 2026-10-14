package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository Repository;

    public ClientService(ClientRepository Repository) {
        this.Repository = Repository;
    }
}