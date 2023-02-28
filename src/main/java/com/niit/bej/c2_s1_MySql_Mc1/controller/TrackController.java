package com.niit.bej.c2_s1_MySql_Mc1.controller;

import com.niit.bej.c2_s1_MySql_Mc1.domain.Track;
import com.niit.bej.c2_s1_MySql_Mc1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrackController {
    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/getTrack")
    public ResponseEntity<?> getAllTrack() {
        List<Track> trackList = trackService.getAllTrack();
        if (trackList.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(trackList, HttpStatus.FOUND);
    }

    @PostMapping("/saveTrack")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) {
        Track newTrack = trackService.addNewTrack(track);
        if (newTrack != null) return new ResponseEntity<>(newTrack, HttpStatus.CREATED);
        else return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping("/updateTrack/{id}")
    public ResponseEntity<?> updateTrack(@PathVariable Integer id, @RequestBody Track track) {
        Track updatedTrack = trackService.updateTrack(track, id);
        if (updatedTrack != null) return new ResponseEntity<>(updatedTrack, HttpStatus.ACCEPTED);
        else return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);

    }

    @GetMapping("/getByArtistName/{artistName}")
    public ResponseEntity<?> getTrackByArtistName(@PathVariable String trackName) {
        List<Track> findByArtistName = trackService.fetchByArtistName(trackName);
        if (findByArtistName.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(findByArtistName, HttpStatus.FOUND);

    }

    public ResponseEntity<?> deleteTrack(@PathVariable Integer id) {
        boolean status = trackService.deleteATrack(id);
        if (status) return new ResponseEntity<>(HttpStatus.ACCEPTED);
        else return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }


}
