package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.PaiementRepository;

@Service
public class PaiementService {

    private final PaiementRepository Repository;

    public PaiementService(PaiementRepository Repository) {
        this.Repository = Repository;
    }
}