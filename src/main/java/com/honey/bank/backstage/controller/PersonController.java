package com.honey.bank.backstage.controller;

import com.honey.bank.backstage.entity.Person;
import com.honey.bank.backstage.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("list")
    public List<Person> findAll(){
        return personService.findAll();
    }

}
