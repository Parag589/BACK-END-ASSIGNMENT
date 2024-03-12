
package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;
    private int chapters;
    private int noOfClasses;
    private String type; // Personalised, Group
    private String learnMode; // Assisted, Self Learning

    // Constructors, getters, setters

}
