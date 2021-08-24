package com.honey.bank.backstage.controller;

import com.honey.bank.backstage.entity.User;
import com.honey.bank.backstage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("check")
    public String check(String username, String password, HttpServletRequest request) {
        LOG.info("username:{}",username);
        LOG.info("password:{}",password);
        User user = userMapper.findOneByUsernameAndPasswordUser(username, password);
        if (user == null) {
            //没有这个用户
            return "redirect:/user/login";
        }
        //将用户信息放入session中
        HttpSession session = request.getSession();
        session.setAttribute("user", user.getId());

        //TODO:跳转到查询页面
        return "";
    }
}
