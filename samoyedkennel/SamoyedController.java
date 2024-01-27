package com.samoyedkennel.samoyedkennel;

import com.samoyedkennel.samoyedkennel.model.Samoyed;
import com.samoyedkennel.samoyedkennel.service.SamoyedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/samoyed")
public class SamoyedController {
    private final SamoyedService samoyedService;

    public SamoyedController(SamoyedService samoyedService) {
        this.samoyedService = samoyedService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Samoyed>> getAllSamoyeds() {
        List<Samoyed> samoyeds = samoyedService.findAllSamoyeds();
        return new ResponseEntity<>(samoyeds, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Samoyed> getSamoyedById(@PathVariable("id") Long id) {
        Samoyed samoyed = samoyedService.findSamoyedById(id);
        return new ResponseEntity<>(samoyed, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Samoyed> addSamoyed(@RequestBody Samoyed samoyed) {
        Samoyed newSamoyed = samoyedService.addSamoyed(samoyed);
        return new ResponseEntity<>(newSamoyed, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Samoyed> updateSamoyed(@RequestBody Samoyed samoyed) {
        Samoyed updateSamoyed = samoyedService.updateSamoyed(samoyed);
        return new ResponseEntity<>(updateSamoyed, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSamoyed(@PathVariable("id") Long id) {
        samoyedService.deleteSamoyed(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
