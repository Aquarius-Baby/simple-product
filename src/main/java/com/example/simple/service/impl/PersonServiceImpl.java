package com.example.simple.service.impl;

import com.example.simple.dao.PersonMapper;
import com.example.simple.entity.Person;

import com.example.simple.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Person getPerson(int id) {
        Person person = personMapper.getPersonById(id);
        return person;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Person addPerson() {
        Person person = new Person();
        person.setName("Luuu");
        person.setAge(12);
        person.setSex(0);
        personMapper.addPerson(person);
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updatePerson(Person person) {
        personMapper.update(person);
        int a = 1 / person.getSex() ;
        return 0;
    }


}
