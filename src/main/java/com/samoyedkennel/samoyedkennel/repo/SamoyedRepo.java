package com.samoyedkennel.samoyedkennel.repo;

import com.samoyedkennel.samoyedkennel.model.Samoyed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SamoyedRepo extends JpaRepository<Samoyed, Long> {
    void deleteSamoyedById(Long id);

    Optional<Samoyed> findSamoyedById(Long id);
}
