package com.db.database.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.db.database.model.*;
import com.db.database.repository.*;

@Service
public class MyService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PassportRepository passportRepository;
    @Autowired
    private AuthorRepository addressRepository;

public void createPersonWithPassport() // create a Person entity with a Passport entity
{
    Person person = new Person();
    person.setName("Max Mustermann");

    Passport passport = new Passport();
    passport.setPassportNumber("123456789");
    person.setPassport(passport);

    personRepository.save(person);

}

public void createAuthorWithBooks() // create an Author entity with a Book entity
{
    Author author = new Author();
    author.setName("Lina Musterfrau");

    Book book1 = new Book();
    book1.setTitle("Book 1");
    book1.setAuthor(author);

    Book book2 = new Book();
    book2.setTitle("Book 2");
    book2.setAuthor(author);

    author.getBooks().add(book1);
    author.getBooks().add(book2);

    addressRepository.save(author);
}

public void deletePersonWithPassport() // delete a Person entity with a Passport entity
{
    Person person = personRepository.findById(1L).get();
    personRepository.delete(person);

}

public List<Person> getAllPersons() // get all Person entities
{
    return personRepository.findAll();

}

public List<Author> getAllAuthors() // get all Author entities
{
    return addressRepository.findAll();
}

}
