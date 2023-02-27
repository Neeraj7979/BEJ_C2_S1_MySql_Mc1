package com.niit.bej.c2_s1_MySql_Mc1.service;

import com.niit.bej.c2_s1_MySql_Mc1.domain.Track;

import java.util.List;

public interface TrackService {
    List<Track> getAllTrack();

    Track addNewTrack(Track track);

    Track getTrackById(Integer id);

    Track updateTrack(Track track, Integer id);

    List<Track> fetchByArtistName(String artistName);


}
