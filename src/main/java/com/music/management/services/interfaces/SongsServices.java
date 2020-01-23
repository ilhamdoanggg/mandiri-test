package com.music.management.services.interfaces;

import com.music.management.entity.Songs;

import java.util.List;

public interface SongsServices {
    Songs saveSong(Songs songs);

    List<Songs> getAllSongs();

    Songs getSongById(String id);

    void deleteSongById(String id);
}
