package com.honey.bank.backstage.service;

import com.honey.bank.backstage.entity.Person;
import com.honey.bank.backstage.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public List<Person> findAll(Integer page, Integer size, Person person) {
        return personMapper.findAllPage(page, size, person);
    }
}
