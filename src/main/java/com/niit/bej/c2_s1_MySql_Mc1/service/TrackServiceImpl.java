package com.niit.bej.c2_s1_MySql_Mc1.service;

import com.niit.bej.c2_s1_MySql_Mc1.domain.Track;
import com.niit.bej.c2_s1_MySql_Mc1.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return trackRepository.save(track);
    }

    @Override
    public Track getTrackById(Integer id) {
        Optional<Track> trackOptional = trackRepository.findById(id);
        return trackOptional.get();
    }

    @Override
    public Track updateTrack(Track track, Integer id) {
        Optional<Track> trackOptional = trackRepository.findById(id);
        Track existingTrack = null;
        if (trackOptional.isEmpty())
            return existingTrack;
        else
            existingTrack = trackOptional.get();
        if (track.getTrackName() != null)
            existingTrack.setTrackName(track.getTrackName());
        if (track.getTrackArtist() != null)
            existingTrack.setTrackArtist(track.getTrackArtist());
        if (track.getTrackComments() != null)
            existingTrack.setTrackComments(track.getTrackComments());
        return trackRepository.save(existingTrack);

    }

    @Override
    public List<Track> fetchByArtistName(String artistName) {


    }

    @Override
    public boolean deleteATrack(Integer id) {
        return false;
    }
}
