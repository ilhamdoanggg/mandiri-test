package com.music.management.services.interfaces;

import com.music.management.entity.Albums;

import java.util.List;

public interface AlbumsServices {
    Albums saveAlbum(Albums albums);
    Albums saveAlbumWithSongs(Albums albums);
    List<Albums> getAllListAlbums();
    Albums getAlbumsById(String id);
    void deleteAlbumById(String id);
}
