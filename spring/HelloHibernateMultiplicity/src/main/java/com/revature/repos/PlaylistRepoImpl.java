package com.revature.repos;

import com.revature.models.Playlist;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PlaylistRepoImpl implements PlaylistRepo{

    @PersistenceContext
    EntityManager em;

    @Override
    public void updatePlaylist(Playlist playlist) {
        Session session = em.unwrap(Session.class);

        session.update(playlist);
    }

    @Override
    public Integer createPlaylist(Playlist playlist) {
        Session session = em.unwrap(Session.class);

        return (Integer) session.save(playlist);
    }

    @Override
    public Playlist getOne(Integer playlistId) {
        Session session = em.unwrap(Session.class);

        return session.get(Playlist.class, playlistId);
    }
}
