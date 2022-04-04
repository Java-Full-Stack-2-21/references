package com.revature.controllers;

import com.revature.models.Song;
import com.revature.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("song")
public class SongController {

    @Autowired
    private SongService songService;

    @PostMapping
    public Song createSong(@RequestBody Song song){
        return this.songService.createSong(song);
    }

    @GetMapping
    public List<Song> getAllSongs(){
        return this.songService.getAllSongs();
    }

    @GetMapping("{songId}")
    public Song getOneSong(@PathVariable Integer songId){
        return this.songService.getOne(songId);
    }
}
