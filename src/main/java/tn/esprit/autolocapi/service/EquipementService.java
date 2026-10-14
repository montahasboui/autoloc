package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.EquipementRepository;

@Service
public class EquipementService {

    private final EquipementRepository Repository;

    public EquipementService(EquipementRepository Repository) {
        this.Repository = Repository;
    }
}