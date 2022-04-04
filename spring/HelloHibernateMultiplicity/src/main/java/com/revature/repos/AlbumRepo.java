package com.revature.repos;

import com.revature.models.Album;

import java.util.List;

public interface AlbumRepo {
    Integer createAlbum(Album album);
    List<Album> getAllAlbums();
    Album getOneAlbum(Integer albumId);
    void removeAlbum(Album album);
}
