package com.example.jpa.repository;

import com.example.jpa.model.City;
import com.example.jpa.model.Information;
import com.example.jpa.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonCrudRepository extends CrudRepository<Person, Information> {
    List<Person> findByCityOfLivingName(String name);

    List<Person> findByInformationAgeLessThan(int age);

    Optional<Person> findByInformationNameAndInformationSurname(String name,String surname);

}
