package com.revature.HelloHibernate.services;

import com.revature.HelloHibernate.models.User;
import com.revature.HelloHibernate.repos.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
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
        return userDao.save(user);
    }

    public User getOne(Integer userId){
        return userDao.getById(userId);
    }

    public User updateOne(User user){
        User userFromDb = userDao.findById(user.getId()).orElse(null);

        if(userFromDb == null) return null;

        return userDao.save(user);
    }

    public void deleteOne(Integer userId){
        userDao.deleteById(userId);
    }

    public List<User> getAll(){
        return userDao.findAll();
    }

    public User getOneGivenUsername(String username){
        return userDao.findByUsername(username);
    }

}
