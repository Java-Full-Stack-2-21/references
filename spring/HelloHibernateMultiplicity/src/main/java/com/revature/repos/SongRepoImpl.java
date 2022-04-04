package com.revature.repos;

import com.revature.models.Song;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SongRepoImpl implements SongRepo{

    @PersistenceContext
    EntityManager em;

    @Override
    public Integer createSong(Song song) {
        Session session = em.unwrap(Session.class);

        return (Integer) session.save(song);
    }

    @Override
    public List<Song> getAllSongs() {
        Session session = em.unwrap(Session.class);

        return session.createQuery("from Song", Song.class).getResultList();
    }

    @Override
    public Song getOneSong(Integer songId) {
        Session session = em.unwrap(Session.class);

        return session.get(Song.class, songId);
        //return session.createQuery("from Song where id = " + songId, Song.class).getSingleResult();
    }
}
