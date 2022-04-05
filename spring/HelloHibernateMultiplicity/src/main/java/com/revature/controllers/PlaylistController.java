package com.revature.controllers;

import com.revature.models.Playlist;
import com.revature.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("playlist")
public class PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @PostMapping
    public Playlist createPlaylist(@RequestBody Playlist playlist){
        return playlistService.createPlaylist(playlist);
    }

    //http://localhost:9000/playlist/1/song/1
    @PatchMapping("{playlistId}/song/{songId}")
    public Playlist addSongToPlaylist(@PathVariable Integer playlistId, @PathVariable Integer songId){
        return playlistService.addSong(playlistId,songId);
    }

    @GetMapping("{playlistId}")
    public Playlist getOne(@PathVariable Integer playlistId){
        return playlistService.getOne(playlistId);
    }

    @GetMapping("{playlistId}/name")
    public String getName(@PathVariable Integer playlistId){
        return playlistService.getOne(playlistId).getName();
    }

}
