package services;

import lombok.Setter;
import models.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repos.VideoGameDao;
import repos.VideoGameDaoImpl;

import java.util.List;

//@Service
public class VideoGameService {

    //@Autowired //field injection (not recommended by spring)
    private VideoGameDao videoGameDao;

    public VideoGameService() { }


    //@Autowired // constructor injection
    public VideoGameService(VideoGameDao videoGameDao){
        this.videoGameDao = videoGameDao;
    }

    public List<VideoGame> getAll(){
        return videoGameDao.getAllVideoGames();
    }


    //example of setter injection in relation to the beans.xml
    //@Autowired //setter injection
    public void setVideoGameDao(VideoGameDao videoGameDao) {
        this.videoGameDao = videoGameDao;
    }
}
