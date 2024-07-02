package com.db.database.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Author {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;

@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
// mappedBy = "author" gibt an, dass die Beziehung in der Book Klasse definiert ist
// cascade = CascadeType.ALL gibt an, dass alle Operationen, die auf der Author Klasse ausgeführt werden, auch auf die Book Klasse angewendet werden
// orphanRemoval = true gibt an, dass, wenn ein Buch aus der Liste der Bücher entfernt wird, es auch aus der Datenbank entfernt wird

private List<Book> books = new ArrayList<>();  
// Die Beziehung wird in der Book Klasse definiert
// Die Liste der Bücher, die der Autor geschrieben hat


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

public List<Book> getBooks() {
return books;
}

public void setBooks(List<Book> books) {
this.books = books;

}
}