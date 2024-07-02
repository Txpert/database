package com.db.database.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    // name ="passport_id" gibt den Namen der Spalte an, die in der Person Tabelle erstellt wird, umd die Beziehung zu der Passport Tabelle zu definieren

    private Passport passport;


    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}