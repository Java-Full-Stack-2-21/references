package com.revature.services;

import com.revature.models.Album;
import com.revature.repos.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AlbumService {

    private AlbumRepo albumRepo;

    @Autowired
    public AlbumService(AlbumRepo albumRepo){
        this.albumRepo = albumRepo;
    }

    //javadocs remember?
    /**
     * <h4>This method will create a new album to the database and return the album with the correct primary key</h4>
     * @param album album object to persist to the db
     * @return album object from the db
     */
    public Album createAlbum(Album album){
        Integer albumId = this.albumRepo.createAlbum(album);

        return this.albumRepo.getOneAlbum(albumId);
    }

    public List<Album> getAllAlbums(){
        return this.albumRepo.getAllAlbums();
    }

    public Album getOne(Integer albumId){
        return this.albumRepo.getOneAlbum(albumId);
    }

    public void removeOne(Integer albumId){
        Album album = this.albumRepo.getOneAlbum(albumId);
        this.albumRepo.removeAlbum(album);
    }

}
