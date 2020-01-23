package com.music.management.services.implementation;

import com.music.management.entity.Albums;
import com.music.management.entity.Songs;
import com.music.management.repository.AlbumsRepository;
import com.music.management.services.interfaces.AlbumsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumsServicesImpl implements AlbumsServices {
    @Autowired
    AlbumsRepository albumsRepository;

    @Override
    public Albums saveAlbum(Albums albums) {
        return albumsRepository.save(albums);
    }

    @Override
    public List<Albums> getAllListAlbums() {
        return albumsRepository.findAll();
    }

    @Override
    public Albums getAlbumsById(String id) {
        if (!albumsRepository.findById(id).isPresent()) {
            return new Albums();
        }
        return albumsRepository.findById(id).get();
    }

    @Override
    public Albums saveAlbumWithSongs(Albums albums) {
        for (Songs songs : albums.getSongsList()) {
            songs.setAlbums(albums);
        }
        return albumsRepository.save(albums);
    }

    @Override
    public void deleteAlbumById(String id) {
        albumsRepository.deleteById(id);
    }
}
