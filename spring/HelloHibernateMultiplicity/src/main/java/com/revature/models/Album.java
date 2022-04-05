package com.revature.models;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "albums")
public class Album {

    /*
    * There are two primary attributes when dealing with multiplicity annotations:
    *    - fetch:
    *       - fetch type eager
    *           - going to retrieve everything you need from the model the first time
    *       - fetch type lazy
    *           - retrieves only whats needed at that given time
    *
    *    - cascade:
    *       - manages the state of the associated entities related to the entity we are currently in
    *       - if cascade is of type All, any DML operation will modify the entities within
    *
    * Default fetch types for the multiplicity relationships:
    *   - OneToOne : Eager
    *   - ManyToOne : Eager
    *   - OneToMany : Lazy
    *   - ManyToMany : Lazy
    *
    *
    *
    * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL) //this references the variable in the song class
    private List<Song> songs = new ArrayList<>();
}
