package com.revature.services;

import com.revature.models.Playlist;
import com.revature.models.Song;
import com.revature.repos.PlaylistRepo;
import com.revature.repos.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaylistService {

    @Autowired
    PlaylistRepo playlistRepo;

    @Autowired
    SongRepo songRepo;

    public Playlist createPlaylist(Playlist playlist){
        Integer playlistId = playlistRepo.createPlaylist(playlist);

        return playlistRepo.getOne(playlistId);
    }

    /*
    * There are 3 states an object can be in when we use hibernate:
    *   - Transient: doesnt have a direct tie to the database
    *   - Persistent: has a direct tie to the database
    *   - Detached: it was persisted but the session has been terminated
    * */
    public Playlist addSong(Integer playlistId, Integer songId){

        //get the persisted playlist object from db
        Playlist playlist = playlistRepo.getOne(playlistId);

        //get the persisted song object from db
        Song song = songRepo.getOneSong(songId);

        //add persisted song to songs array in playlist
        List<Song> songsInPlaylist = playlist.getSongs();
        songsInPlaylist.add(song);
        playlist.setSongs(songsInPlaylist);

        //use the update method
        playlistRepo.updatePlaylist(playlist);

        return playlist;
    }

    public Playlist getOne(Integer playlistId){
        return playlistRepo.getOne(playlistId);
    }

}
