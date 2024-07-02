package com.db.database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.db.database.model.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long>{}
