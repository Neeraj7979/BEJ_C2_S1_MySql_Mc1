package com.niit.bej.c2_s1_MySql_Mc1.controller;

import com.niit.bej.c2_s1_MySql_Mc1.domain.Track;
import com.niit.bej.c2_s1_MySql_Mc1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        if (trackList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(trackList, HttpStatus.FOUND);
    }


}
