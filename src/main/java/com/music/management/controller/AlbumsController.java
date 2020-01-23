package com.music.management.controller;

import com.music.management.entity.Albums;
import com.music.management.services.interfaces.AlbumsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumsController {
    @Autowired
    AlbumsServices albumsServices;

    @GetMapping("/albums")
    public List<Albums> getAlbumsList(){
        return albumsServices.getAllListAlbums();
    }
    @GetMapping("/album/{id}")
    public Albums getAlbumById(@PathVariable String id){
        return albumsServices.getAlbumsById(id);
    }
    @PostMapping("/album")
    public Albums saveNewAlbum(@RequestBody Albums albums){
        return albumsServices.saveAlbum(albums);
    }
    @PostMapping("/album-song")
    public Albums saveAlbumsWithSongs(@RequestBody Albums albums){
        return albumsServices.saveAlbumWithSongs(albums);
    }
    @DeleteMapping("/album")
    public void deleteAlbum(@PathVariable String id){
        albumsServices.deleteAlbumById(id);
    }

}
