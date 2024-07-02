package com.db.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.db.database.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
