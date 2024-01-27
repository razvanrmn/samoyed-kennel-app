package com.samoyedkennel.samoyedkennel.service;

import com.samoyedkennel.samoyedkennel.exception.SamoyedNotFoundException;
import com.samoyedkennel.samoyedkennel.model.Samoyed;
import com.samoyedkennel.samoyedkennel.repo.SamoyedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SamoyedService {
    private final SamoyedRepo samoyedRepo;

    @Autowired
    public SamoyedService(SamoyedRepo samoyedRepo) {
        this.samoyedRepo = samoyedRepo;
    }

    public Samoyed addSamoyed(Samoyed samoyed) {
        samoyed.setMicrochip(UUID.randomUUID().toString());
        return samoyedRepo.save(samoyed);
    }

    public List<Samoyed> findAllSamoyeds() {
        return samoyedRepo.findAll();
    }

    public Samoyed updateSamoyed(Samoyed samoyed) {
        return samoyedRepo.save(samoyed);
    }

    public Samoyed findSamoyedById(Long id) {
        return samoyedRepo.findSamoyedById(id).orElseThrow(
                () -> new SamoyedNotFoundException("Samoyed by id: " + id + " was not found!")
        );
    }

    public void deleteSamoyed(Long id) {
        samoyedRepo.deleteSamoyedById(id);
    }
}
