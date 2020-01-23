package com.music.management.controller;

import com.music.management.entity.Songs;
import com.music.management.services.interfaces.SongsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    SongsServices songsServices;

    @GetMapping("/songs")
    public List<Songs> getAllListSongs() {
        return songsServices.getAllSongs();
    }

    @GetMapping("/song/{id}")
    public Songs getSongById(@PathVariable String id) {
        return songsServices.getSongById(id);
    }

    @PostMapping("/song")
    public Songs saveNewSong(@RequestBody Songs songs) {
        return songsServices.saveSong(songs);
    }

    @DeleteMapping("/song/{id}")
    public void deleteSongWithId(@PathVariable String id){
        songsServices.deleteSongById(id);
    }


}
