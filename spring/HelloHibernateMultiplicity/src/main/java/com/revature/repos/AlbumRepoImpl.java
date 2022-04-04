package com.revature.repos;

import com.revature.models.Album;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AlbumRepoImpl implements AlbumRepo{

    @PersistenceContext
    EntityManager em;

    @Override
    public Integer createAlbum(Album album) {
        Session session = em.unwrap(Session.class);

        return (Integer) session.save(album);
    }

    @Override
    public List<Album> getAllAlbums() {
        Session session = em.unwrap(Session.class);

        //hql
        return session.createQuery("from Album", Album.class).getResultList();
    }

    @Override
    public Album getOneAlbum(Integer albumId) {
        Session session = em.unwrap(Session.class);

        return session.get(Album.class, albumId);
    }

    @Override
    public void removeAlbum(Album album) {
        Session session = em.unwrap(Session.class);

        session.delete(album);
    }
}
