package com.honey.bank.backstage.controller;

import com.honey.bank.backstage.entity.Person;
import com.honey.bank.backstage.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("list")
    public List<Person> findAll(Integer page, Integer size, Person person) {
        return personService.findAll(page, size, person);
    }

}
