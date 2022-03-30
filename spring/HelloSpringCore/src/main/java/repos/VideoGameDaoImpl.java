package repos;

import models.VideoGame;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
* Stereotypes are annotations that tell Spring that THIS class is a spring bean
*  - @Component
*       - @Repository <-- for dao layer
*       - @Service <-- for service layer
*       - @Controller <-- for controller layer
* */

//@Repository
public class VideoGameDaoImpl implements VideoGameDao{

    @Override
    public List<VideoGame> getAllVideoGames() {
        List<VideoGame> games = new ArrayList<>();
        games.add(new VideoGame("Sly 2", "Racoon Robinhood", "playstation 2"));
        games.add(new VideoGame("Ratchet and Clank", "Wombat that travels around the galaxy", "playstation 2"));
        games.add(new VideoGame("Halo", "Something about a ring?", "xbox"));
        games.add(new VideoGame("Mario Sunshine", "Off brand mario 64 but with a jet pack", "gamecube"));
        games.add(new VideoGame("pokemon gold", "capture animals (sad day)", "gameboy"));

        return games;
    }

}
