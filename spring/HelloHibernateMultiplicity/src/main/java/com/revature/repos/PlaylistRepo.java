package com.revature.repos;

import com.revature.models.Playlist;

public interface PlaylistRepo {
    void updatePlaylist(Playlist playlist);
    Integer createPlaylist(Playlist playlist);
    Playlist getOne(Integer playlistId);
}