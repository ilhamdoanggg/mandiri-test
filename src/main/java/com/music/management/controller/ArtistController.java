package com.music.management.controller;

import com.music.management.entity.Artists;
import com.music.management.services.interfaces.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    ArtistServices artistServices;

    @PostMapping("/artist")
    public Artists saveNewArtist(@RequestBody Artists artists){
        return artistServices.saveArtist(artists);
    }

    @PostMapping("/artist-songs")
    public Artists saveArtistsWithSongs(@RequestBody Artists artists){
        return artistServices.saveArtistWithSong(artists);
    }

    @GetMapping("/artists")
    public List<Artists> getAllArtistList(){
        return artistServices.getAllArtist();
    }

    @GetMapping("/artist/{id}")
    public Artists getArtistById(@PathVariable String  id){
        return artistServices.getArtistById(id);
    }
    @DeleteMapping("/artist/{id}")
    public void deleteArtist(@PathVariable String id){
        artistServices.deleteArtisttById(id);
    }

}
