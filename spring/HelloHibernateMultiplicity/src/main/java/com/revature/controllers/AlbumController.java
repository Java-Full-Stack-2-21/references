package com.revature.controllers;

import com.revature.models.Album;
import com.revature.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album createAlbum(@RequestBody Album album){
        return this.albumService.createAlbum(album);
    }

    @GetMapping
    public List<Album> getAllAlbums(){
        return this.albumService.getAllAlbums();
    }

    //http://localhost:9000/album/1
    @GetMapping("{albumId}")
    public Album getOne(@PathVariable Integer albumId){
       return this.albumService.getOne(albumId);
    }

    @GetMapping("name/{albumId}")
    public String getAlbumName(@PathVariable Integer albumId){
        return this.albumService.getOne(albumId).getName();
    }

    @DeleteMapping("{albumId}")
    public String removeAlbum(@PathVariable Integer albumId){
        this.albumService.removeOne(albumId);

        return "album with id " + albumId + " removed if album exists";
    }

}
