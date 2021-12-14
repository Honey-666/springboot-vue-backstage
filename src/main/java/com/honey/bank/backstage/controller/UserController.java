package com.honey.bank.backstage.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.honey.bank.backstage.pojo.User;
import com.honey.bank.backstage.service.UserService;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> userList(User user) {
        //第一个为页数，第二个为显示条数
        IPage<User> page = new Page<>(user.getPageNumber(), user.getSize());
        return userService.page(page, new QueryWrapper<User>(user)).getRecords();
    }

    @GetMapping("/one")
    public User getOne(Long id) {
        return userService.getById(id);
    }

    @PostMapping("/save_or_edit")
    public boolean saveOrEdit(User user) {
        if (Objects.isNull(user.getId())) {
            return userService.save(user);
        } else {
            return userService.updateById(user);
        }
    }

    @DeleteMapping("/delete")
    public boolean delete(Long id) {
        return userService.removeById(id);
    }
}
