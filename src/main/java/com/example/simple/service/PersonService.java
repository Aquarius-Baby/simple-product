package com.example.simple.service;


import com.example.simple.entity.Person;

public interface PersonService {
    Person getPerson(int id);

    Person addPerson();

    int updatePerson(Person person);
}
