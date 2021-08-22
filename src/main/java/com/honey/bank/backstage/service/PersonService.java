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

    public List<Person> findAll(Integer beginSize, Integer size, Person person) {
        return personMapper.findAllPage(beginSize, size, person);
    }

    public Person findOneById(Long id) {
        return personMapper.selectByPrimaryKey(id);
    }

    public int save(Person person) {
        return personMapper.insertEntity(person);
    }

    public int update(Person person) {
        return personMapper.updateByPrimaryKey(person);
    }

    public int delete(Long id) {
        return personMapper.deleteByPrimaryKey(id);
    }
}
