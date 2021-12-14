package com.honey.bank.backstage.service.impl;

import com.honey.bank.backstage.pojo.User;
import com.honey.bank.backstage.mapper.UserMapper;
import com.honey.bank.backstage.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bank
 * @since 2021-12-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
