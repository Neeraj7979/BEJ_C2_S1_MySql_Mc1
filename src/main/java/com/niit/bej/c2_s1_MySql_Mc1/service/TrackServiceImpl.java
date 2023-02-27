package com.niit.bej.c2_s1_MySql_Mc1.service;

import com.niit.bej.c2_s1_MySql_Mc1.domain.Track;
import com.niit.bej.c2_s1_MySql_Mc1.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {
    TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public List<Track> getAllTrack() {
        return (List<Track>) trackRepository.findAll();
    }

    @Override
    public Track addNewTrack(Track track) {
        return null;
    }

    @Override
    public Track getTrackById(Integer id) {
        return null;
    }

    @Override
    public Track updateTrack(Track track, Integer id) {
        return null;
    }

    @Override
    public List<Track> fetchByArtistName(String artistName) {
        return null;
    }

    @Override
    public boolean deleteATrack(Integer id) {
        return false;
    }
}
