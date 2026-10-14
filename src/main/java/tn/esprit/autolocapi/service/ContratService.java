package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.ContratRepository;

@Service
public class ContratService {

    private final ContratRepository Repository;

    public ContratService(ContratRepository Repository) {
        this.Repository = Repository;
    }
}