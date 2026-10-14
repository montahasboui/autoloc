package tn.esprit.autolocapi.service;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.ReservationRepository;

@Service
public class ReservationService {

    private final ReservationRepository Repository;

    public ReservationService(ReservationRepository Repository) {
        this.Repository = Repository;
    }
}