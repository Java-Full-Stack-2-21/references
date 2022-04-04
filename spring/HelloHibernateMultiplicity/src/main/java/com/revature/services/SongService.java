package com.revature.services;

import com.revature.models.Album;
import com.revature.models.Song;
import com.revature.repos.AlbumRepo;
import com.revature.repos.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SongService {

    SongRepo songRepo;

    AlbumRepo albumRepo;

    @Autowired
    public SongService(SongRepo songRepo, AlbumRepo albumRepo){
        this.songRepo = songRepo;
        this.albumRepo = albumRepo;
    }

    public Song createSong(Song song){
        Integer songId = this.songRepo.createSong(song);

        Song songFromDb = this.songRepo.getOneSong(songId);
        Album album = this.albumRepo.getOneAlbum(songFromDb.getAlbum().getId());
        songFromDb.setAlbum(album);

        return songFromDb;
    }

    public List<Song> getAllSongs(){
        return this.songRepo.getAllSongs();
    }

    public Song getOne(Integer songId){
        return this.songRepo.getOneSong(songId);
    }

}
