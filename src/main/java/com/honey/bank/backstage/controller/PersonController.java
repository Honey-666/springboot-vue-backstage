package com.honey.bank.backstage.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honey.bank.backstage.pojo.Person;
import com.honey.bank.backstage.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author bank
 * @since 2021-12-11
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public List<Person> PersonList(Person person) {

        //第一个为页数，第二个为显示条数
        IPage<Person> page = new Page<>(person.getPageNumber(), person.getSize());
        return personService.page(page, new QueryWrapper<Person>(person)).getRecords();
    }

    @GetMapping("/one")
    public Person getOne(Long id) {
        return personService.getById(id);
    }

    @PostMapping("/save_or_edit")
    public boolean saveOrEdit(Person person) {
        if (Objects.isNull(person.getId())) {
            return personService.save(person);
        } else {
            return personService.updateById(person);
        }
    }

    @DeleteMapping("/delete")
    public boolean delete(Long id) {
        return personService.removeById(id);
    }

}
