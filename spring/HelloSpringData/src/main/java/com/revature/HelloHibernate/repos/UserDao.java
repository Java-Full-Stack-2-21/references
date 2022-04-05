package com.revature.HelloHibernate.repos;

import com.revature.HelloHibernate.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* The spring data module simplifies our DAO by providing a standard implementation for our
* common DAO methods.
*   - Because of this, we no longer need an implementation class
*
* common crud methods:
*   - findAll() <-- select all from table
*   - findById(id) <---- select one given pk  (returns an optional)
*   - save(model) <---- create / update
*   - deleteById(id) <--- delete given pk
* */

//JpaRepository<ModelDataType, PrimaryKeyDataType>
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    /*
    * There is 2 ways we can approach complex queries:
    *   - JPQL : using the @Query annotation with the @Param annotation
    *       refernece: https://www.tutorialspoint.com/jpa/jpa_jpql.htm
    *   - method name
    *       - you can structure your method names in a certain to where it will query what you want
    *       - https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
    * */

//    @Query("from User where username = :name")
//    User getUserGivenUsername(@Param("name") String name);

    User findByUsername(String username);

}
