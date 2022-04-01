package com.revature.HelloHibernate.services;

import com.revature.HelloHibernate.models.User;
import com.revature.HelloHibernate.repos.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/*
* @Transactional ensures that every method in the class waits
* until the whole method is complete before
* making the official commit to the database
*
* */

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;


    public User createOne(User user){
        Integer userId = userDao.createUser(user);
        User userFromDb = userDao.getOne(userId);
        return userFromDb;
    }

    public User getOne(Integer userId){
        return userDao.getOne(userId);
    }

    public User updateOne(User user){
        userDao.updateUser(user);

        return userDao.getOne(user.getId());
    }

    public void deleteOne(Integer userId){
        User user = userDao.getOne(userId);

        userDao.deleteUser(user);
    }

    public List<User> getAll(){
        return userDao.getAll();
    }

    public User getOneGivenUsername(String username){
        return userDao.getOneByUsername(username);
    }

}
