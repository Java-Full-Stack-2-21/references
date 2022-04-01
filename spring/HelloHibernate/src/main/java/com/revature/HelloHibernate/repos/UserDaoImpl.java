package com.revature.HelloHibernate.repos;

import com.revature.HelloHibernate.models.User;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/*
 * Session methods:
 *   - save()                    results in a sql insert (returns the Unique Identifier of the newly created object)
 *   - persist()                 results in a sql insert (returns void)
 * ---------------------------
 *   - saveOrUpdate()            results in either a save or update (returns void)
 * ---------------------------
 *   - update()                  results in a sql update (throws an exception if its used twice in a session)
 *   - merge()                   results in a sql update (doesnt throw an exception)
 * ---------------------------
 *   - delete()                  results in a sql delete
 * ---------------------------
 *   - get()                     results in a sql select (gets object from database)
 *   - load()                    results in a sql select (gets cached object)
 *
* */

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAll() {
        Session session = em.unwrap(Session.class);

        return session.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getOne(Integer userId) {
        //active connection to the database
        Session session = em.unwrap(Session.class);

        return session.get(User.class, userId);
    }

    @Override
    public Integer createUser(User user) {
        Session session = em.unwrap(Session.class);

        return (Integer) session.save(user);
    }

    @Override
    public void updateUser(User user) {
        Session session = em.unwrap(Session.class);

        session.update(user);
    }

    @Override
    public void deleteUser(User user) {
        Session session = em.unwrap(Session.class);

        session.delete(user);
    }

    @Override
    public User getOneByUsername(String username) {
        Session session = em.unwrap(Session.class);
        /*
        *  There are 3 ways to write more complex queries:
        *       - Native SQL
        *           - Not recommend
        *           - Not Programmatic
        *       - HQL
        *           - references classes and variables over tables and columns
        *           - partially programmatic
        *       - Criteria API (CriteriaBuilder API)
        *           - fully programmatic
        *           - No SQL involved at all
        * */

        //Native SQL
        /*NativeQuery query  = session.createSQLQuery("SELECT * FROM users WHERE username = :username");
        query.addEntity(User.class);
        query.setParameter("username", username);
        return (User) query.getSingleResult();*/

        //HQL (what i prefer)
        return session.createQuery("from User where username = '" + username + "'", User.class).getSingleResult();

        //Criteria API
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery<User> cq = cb.createQuery(User.class); //creating criteria query
//        Root<User> user = cq.from(User.class); //defining what table to look through
//        cq.select(user).where(cb.equal(user.get("username"), username)); // the actual statement
//        return em.createQuery(cq).getSingleResult(); //get single result

    }
}
