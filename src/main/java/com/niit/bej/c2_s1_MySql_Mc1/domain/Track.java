package com.niit.bej.c2_s1_MySql_Mc1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackId;
    private String trackName;
    private String trackComments;
    private String trackArtist;
    private double trackRatings;

    public Track(int trackId, String trackName, String trackComments, String trackArtist, double trackRatings) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
        this.trackArtist = trackArtist;
        this.trackRatings = trackRatings;
    }
}
