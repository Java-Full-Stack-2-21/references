package com.revature.repos;

import com.revature.models.Song;

import java.util.List;

public interface SongRepo {
    Integer createSong(Song song);
    List<Song> getAllSongs();
    Song getOneSong(Integer songId);
}
