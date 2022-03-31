package com.revature.HelloSpringMVC.controllers;


import com.revature.HelloSpringMVC.models.VideoGame;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
* Spring Web MVC is a module that deals with HTTP (Http Handler)
*
* Spring Web MVC has its own annotations to know:
*   - @RestController :
*           - Defines class as a Spring Bean
*           - Every method in this class will return the object in json string format
*   - @RequestMapping : defined endpoint and http verb
*   - @ResponseBody :
*           - changes header of Content-Type to application/json
*           - utilizes jackson to convert what the method returns to a json string
*   - @PathVariable : Allows us to retrieve path parameters defined in the URL
*   - @RequestParam : Allows us to retrieve query parameters defined in the URL
*   - @RequestBody : Converts json string from request body to java object
*
* ResponseEntity: Allows us to manipulate all aspects of an http response
* */
@RestController
public class VideoGameController {

    Logger logger = Logger.getLogger(VideoGameController.class);

    /// http://localhost:9000/videogame

    //@RequestMapping(value = "videogame", method = RequestMethod.GET)
    @GetMapping("videogame")
    public List<VideoGame> getAllVideoGames(){
        List<VideoGame> games = new ArrayList<>();
        games.add(new VideoGame("Katamari", "Roll around as a sticky ball", "playstation 2"));
        games.add(new VideoGame("Fossil Fighters", "Dinasaur Pokemon", "nintendo"));
        games.add(new VideoGame("Mortal Kombat", "bloody super smash", "all the things"));

        return games;
    }

    //retrieve info as path parameter
    // http://localhost:9000/path-param/Kevin/Childs <---Kevin and Childs are both path parameters
    //@ResponseBody
    //@RequestMapping(value = "path-param/{firstname}/{lastname}", method = RequestMethod.GET)
    @GetMapping("path-param/{firstname}/{lastname}")
    public String getPathParam(@PathVariable String firstname, @PathVariable String lastname){

        return firstname + " " + lastname;
    }

    //retrieve info as query param
    // http://localhost:9000/query-param?firstname=Kevin&lastname=Childs
    //@ResponseBody
    //@RequestMapping(value = "query-param", method = RequestMethod.GET)
    @GetMapping("query-param")
    public String getQueryParam(@RequestParam String firstname, @RequestParam String lastname){

        return firstname + " " + lastname;
    }


    //retrieve json from the body
    //@RequestMapping(value = "data-from-body", method = RequestMethod.POST)
    @PostMapping("data-from-body")
    public VideoGame getJsonFromBody(@RequestBody VideoGame videoGame){
        System.out.println("Video game from user: " + videoGame);
        return videoGame;
    }

    //@RequestMapping(value = "response-entity-example", method = RequestMethod.POST)
    @PostMapping("response-entity-example")
    public ResponseEntity<VideoGame> responseEntityExample(@RequestBody VideoGame videoGame){
        System.out.println("Video game from user: " + videoGame);
        return ResponseEntity
                .status(HttpStatus.I_AM_A_TEAPOT)
                .header("Custom-Header", "yo-yo")
                .body(videoGame);
    }

    @GetMapping("exception-thrown")
    public ResponseEntity<String> throwException(){
        try{
            throw new Exception("OOPSIE");
        }catch (Exception e){
            logger.warn("Stack Trace?", e);
            //e.printStackTrace();
        }

        return ResponseEntity.ok("Exception thrown");
    }

}
