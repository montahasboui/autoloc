package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.VehiculeRepository;

@Service
public class VehiculeService {

    private final VehiculeRepository Repository;

    public VehiculeService(VehiculeRepository Repository) {
        this.Repository = Repository;
    }
}