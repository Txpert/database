package com.db.database.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    // cascade = CascadeType.ALL gibt an, dass alle Operationen, die auf der Person Klasse ausgeführt werden, auch auf die Passport Klasse angewendet werden
    
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    // joinColumn: Verknüpft die passport_id Spalte in der Person Tabelle mit der id Spalte in der Passport Tabelle.
    
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