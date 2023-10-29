package com.example.jpa.controller;


import com.example.jpa.model.Person;
import com.example.jpa.repository.CityCrudRepository;
import com.example.jpa.repository.PersonCrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class JPAController {

    private final CityCrudRepository cityCrudRepository;
    private final PersonCrudRepository personCrudRepository;

    public JPAController(CityCrudRepository cityCrudRepository, PersonCrudRepository personCrudRepository){
        this.cityCrudRepository = cityCrudRepository;
        this.personCrudRepository = personCrudRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> byCiry(@RequestParam String city){
        return  personCrudRepository.findByCityOfLivingName(city);
    }

    @GetMapping("/persons/LessThan-age")
    public List<Person> byLessThanAge(@RequestParam int age){
        return  personCrudRepository.findByInformationAgeLessThan(age);
    }

    @GetMapping("/persons/by-nameAndSurname")
    public Optional<Person> byLessThanAge(@RequestParam String name, @RequestParam String surname){
        return  personCrudRepository.findByInformationNameAndInformationSurname(name,surname);
    }
}
