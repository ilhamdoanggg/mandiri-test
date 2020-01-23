package com.music.management.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Songs {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String musciTitle;
    private String genres;
    @Transient
    private String idArtistTrancient;
    @JsonIgnore
    @ManyToOne
    private Artists artists;
    @JsonIgnore
    @ManyToOne
    private Albums albums;
    private Calendar releaseDate;

    public Songs() {
    }

    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMusciTitle() {
        return musciTitle;
    }

    public void setMusciTitle(String musciTitle) {
        this.musciTitle = musciTitle;
    }

    public String getIdArtistTrancient() {
        return idArtistTrancient;
    }

    public void setIdArtistTrancient(String idArtistTrancient) {
        this.idArtistTrancient = idArtistTrancient;
    }

    public Artists getArtists() {
        return artists;
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }
}
