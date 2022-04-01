package com.revature.HelloHibernate.models;

import lombok.*;

import javax.persistence.*;


/*
* What is an ORM?
*   - Object Relational Mapping
*   - mapping of Java models to database tables
*
* What is persistence?
*   - essentially means storing your data to a database
*
* What is hibernate?
*   - ORM and persistence framework
*
* */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity //defines we want this class persisted to the database
@Table(name = "users")
public class User {

    @Id //defines primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrements
    private Integer id;

    @Column(unique = true, nullable = false) //we can add constraints like this
    private String username;

    @Column(nullable = false)
    private String password;
}
