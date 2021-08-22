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

    /**
     * 根据条件查所有，带分页
     *
     * @param page
     * @param size
     * @param person
     * @return
     */
    @RequestMapping("list")
    public List<Person> findAll(Integer page, Integer size, Person person) {
        if (page == null) {
            page = 1;
        }
        if (size == null) {
            size = 10;
        }
        //计算分页从哪里开始
        Integer beginSize = (page - 1) * size;
        return personService.findAll(beginSize, size, person);
    }

    /**
     * 查询一个
     *
     * @param id
     * @return
     */
    @RequestMapping("/find_one")
    public Person findOneById(Long id) {
        return personService.findOneById(id);
    }

    /**
     * 保存或者修改
     *
     * @param person
     * @return
     */
    @RequestMapping("save_or_update")
    public int saveOrUpdate(Person person) {
        Long id = person.getId();
        if (id == null) {
            //增加
            return personService.save(person);
        } else {
            //修改
            return personService.update(person);
        }
    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @RequestMapping
    public int delete(Long id) {
        return personService.delete(id);
    }
}
