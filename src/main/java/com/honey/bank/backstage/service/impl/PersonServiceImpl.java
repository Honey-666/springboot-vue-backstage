package com.honey.bank.backstage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.honey.bank.backstage.mapper.PersonMapper;
import com.honey.bank.backstage.pojo.Person;
import com.honey.bank.backstage.service.PersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
