package com.revature.HelloSpringMVC.controllers;


import com.revature.HelloSpringMVC.models.VideoGame;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

//http://localhost:9000/session
@RestController
@RequestMapping(value = "session")
@CrossOrigin(origins = {"http://localhost:4200"}, allowCredentials = "true") // you need to add cross origin to allow other servers to send request to your server
public class SessionController {

    //http://localhost:9000/session POST
    @PostMapping
    public ResponseEntity<VideoGame> login(HttpSession httpSession, @RequestBody VideoGame videoGame){

        //assume that credentials were valid
        httpSession.setAttribute("sessionVar", videoGame);
        return ResponseEntity.status(HttpStatus.OK).body(videoGame);
    }

    //http://localhost:9000/session DELETE
    @DeleteMapping
    public ResponseEntity<String> logout(HttpSession httpSession){

        httpSession.setAttribute("sessionVar", null);
        //httpSession.invalidate();
        return ResponseEntity.status(HttpStatus.OK).body("logged out and session invalidated");
    }

    //http://localhost:9000/session GET
    @GetMapping
    public ResponseEntity<VideoGame> checkSession(HttpSession httpSession){
        VideoGame videoGame = (VideoGame) httpSession.getAttribute("sessionVar");

        if(videoGame == null){
            return ResponseEntity.status(HttpStatus.OK).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(videoGame);

    }

}
