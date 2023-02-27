package com.niit.bej.c2_s1_MySql_Mc1.repository;

import com.niit.bej.c2_s1_MySql_Mc1.domain.Track;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends CrudRepository<Track, Integer> {
    List<Track> findTrackByArtistName(String artistName);

}
