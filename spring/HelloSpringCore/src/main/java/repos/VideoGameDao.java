package repos;

import models.VideoGame;

import java.util.List;

public interface VideoGameDao {
    List<VideoGame> getAllVideoGames();
}
