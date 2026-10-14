package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.EmployeRepository;

@Service
public class EmployeService {

    private final EmployeRepository Repository;

    public EmployeService(EmployeRepository Repository) {
        this.Repository = Repository;
    }
}