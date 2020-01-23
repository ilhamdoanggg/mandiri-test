package com.music.management.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
public class Albums {
    @Id
    private String id;
    private String albumTitle;
    @OneToMany(mappedBy = "albums", cascade = CascadeType.PERSIST)
    private List<Songs> songsList = new ArrayList<>();
    private Calendar albumDate;


    public Albums() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public List<Songs> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<Songs> songsList) {
        this.songsList = songsList;
    }

    public Calendar getAlbumDate() {
        return albumDate;
    }

    public void setAlbumDate(Calendar albumDate) {
        this.albumDate = albumDate;
    }
}
