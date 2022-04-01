package com.revature.HelloHibernate.repos;

import com.revature.HelloHibernate.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getOne(Integer userId);
    Integer createUser(User user);
    void updateUser(User user);
    void deleteUser(User user);

    User getOneByUsername(String username);
}
