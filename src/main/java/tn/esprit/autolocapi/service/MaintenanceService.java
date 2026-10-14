package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.MaintenanceRepository;

@Service
public class MaintenanceService {

    private final MaintenanceRepository Repository;

    public MaintenanceService(MaintenanceRepository Repository) {
        this.Repository = Repository;
    }
}