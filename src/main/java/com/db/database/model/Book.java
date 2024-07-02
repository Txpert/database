package com.db.database.model;

import jakarta.persistence.*;

@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String title;

@ManyToOne // gibt an, dass die Beziehung in der Author Klasse definiert ist
@JoinColumn(name = "author_id", nullable = false)
//joinColumn: Verknüpft die author_id Spalte in der Person Tabelle mit der id Spalte in der Book Tabelle. 

// nullable = false gibt an, dass der author_id Wert nicht null sein kann
// Die Beziehung wird in der Author Klasse definiert
//Verknüpt die author_id Spalte in der Book Tabelle mit der id Spalte in der Author Tabelle

private Author author;

// getters and setters

    public Long getId() {
    return id;
    }

    public void setId(Long id) {
    this.id = id;
    }

    public String getTitle() {
    return title;
    }

    public void setTitle(String title) {
    this.title = title;
    }

    public Author getAuthor() {
    return author;
    }

    public void setAuthor(Author author) {
    this.author = author;
    }


}




