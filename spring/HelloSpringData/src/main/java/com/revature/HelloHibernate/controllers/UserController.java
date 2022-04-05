package com.revature.HelloHibernate.controllers;

import com.revature.HelloHibernate.models.User;
import com.revature.HelloHibernate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{userId}")
    public User getOne(@PathVariable Integer userId){
        return userService.getOne(userId);
    }

    @PostMapping
    public User createOne(@RequestBody User user){
        return userService.createOne(user);
    }

    @PutMapping
    public User updateOne(@RequestBody User user){

        User userFromDb = userService.updateOne(user);

        if(userFromDb == null)
            return new User(null, "user not found", null);

        return userFromDb;
    }



    @DeleteMapping("{userId}")
    public String deleteOne(@PathVariable Integer userId){
        userService.deleteOne(userId);

        return "user with id " + userId + " was deleted if exists";
    }

    @GetMapping
    public List<User> getAll(){
        return this.userService.getAll();
    }

    @GetMapping("username/{username}")
    public User getOneGivenUsername(@PathVariable String username){
        return this.userService.getOneGivenUsername(username);
    }

}
