package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.AgenceRepository;

@Service
public class AgenceService {

    private final AgenceRepository Repository;

    public AgenceService(AgenceRepository Repository) {
        this.Repository = Repository;
    }
}