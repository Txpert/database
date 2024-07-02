package com.db.database.model;

import jakarta.persistence.*;

@Entity
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    // mappedBy = "passport" gibt an, dass die Beziehung in der Person Klasse definiert ist
    private Person person;
    // Die Beziehung wird in der Person Klasse definiert


    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPassportNumber() {
        return passportNumber;
    }


    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}