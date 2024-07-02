package com.db.database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.db.database.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
