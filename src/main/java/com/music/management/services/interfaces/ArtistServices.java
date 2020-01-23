package com.music.management.services.interfaces;

import com.music.management.entity.Artists;

import java.util.List;

public interface ArtistServices {
    Artists saveArtist(Artists artists);

    Artists saveArtistWithSong(Artists artists);

    List<Artists> getAllArtist();

    Artists getArtistById(String id);

    void deleteArtisttById(String id);
}
