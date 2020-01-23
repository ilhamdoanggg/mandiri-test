package com.music.management.services.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.music.management.entity.Artists;
import com.music.management.entity.Songs;
import com.music.management.repository.ArtistRepository;
import com.music.management.services.interfaces.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class ArtistServicesImpl implements ArtistServices {

    @Autowired
    ArtistRepository artistRepository;
    @Override
    public Artists saveArtist(Artists artists) {
        return artistRepository.save(artists);
    }

    @Override
    public List<Artists> getAllArtist() {
        return artistRepository.findAll();
    }

    @Override
    public Artists saveArtistWithSong(Artists artists) {
        for (Songs songs:artists.getSong()) {
            songs.setArtists(artists);
        }
        return artistRepository.save(artists);
    }

    @Override
    public Artists getArtistById(String id) {
        if (!artistRepository.findById(id).isPresent()) {
            return new Artists();
        }
        return artistRepository.findById(id).get();
    }

    @Override
    public void deleteArtisttById(String id) {
        artistRepository.deleteById(id);
    }
}
