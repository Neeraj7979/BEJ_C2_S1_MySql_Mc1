package com.niit.bej.c2_s1_MySql_Mc1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

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

    public Track() {
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public double getTrackRatings() {
        return trackRatings;
    }

    public void setTrackRatings(double trackRatings) {
        this.trackRatings = trackRatings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return trackId == track.trackId && Double.compare(track.trackRatings, trackRatings) == 0 && Objects.equals(trackName, track.trackName) && Objects.equals(trackComments, track.trackComments) && Objects.equals(trackArtist, track.trackArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, trackName, trackComments, trackArtist, trackRatings);
    }

    @Override
    public String toString() {
        return "Track{" + "trackId=" + trackId + ", trackName='" + trackName + '\'' + ", trackComments='" + trackComments + '\'' + ", trackArtist='" + trackArtist + '\'' + ", trackRatings=" + trackRatings + '}';
    }
}
