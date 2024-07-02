package com.db.database.controller;

import com.db.database.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.db.database.service.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MyService myService;

    @PostMapping("/createPersonWithPassport")
    public void createPersonWithPassport() {
        myService.createPersonWithPassport();
    }

    @PostMapping("/createAuthorWithBooks")
    public void createAuthorWithBooks() {
        myService.createAuthorWithBooks();
    }

    // @DeleteMapping("/deletePersonWithPassport")
    // public void deletePersonWithPassport() {
    //     myService.deletePersonWithPassport();
    // }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return myService.getAllAuthors();
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return myService.getAllPersons();
    }

}
