package com.music.management.services.implementation;

import com.music.management.entity.Songs;
import com.music.management.repository.SongsRepository;
import com.music.management.services.interfaces.SongsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsServicesImpl implements SongsServices {

    @Autowired
    SongsRepository songsRepository;

    @Override
    public Songs saveSong(Songs songs) {
        return songsRepository.save(songs);
    }

    @Override
    public List<Songs> getAllSongs() {
        return songsRepository.findAll();
    }

    @Override
    public Songs getSongById(String id) {
        if (!songsRepository.findById(id).isPresent()){
            return new Songs();
        }
        return songsRepository.findById(id).get();
    }

    @Override
    public void deleteSongById(String id) {
        songsRepository.deleteById(id);
    }
}
