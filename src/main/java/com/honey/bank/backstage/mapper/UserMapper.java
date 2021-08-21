package com.honey.bank.backstage.mapper;

import com.honey.bank.backstage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectByPrimaryKey(@Param("id") Long id);

    List<User> findAllPage(@Param("page") Integer page, @Param("size") Integer size, User user);

    int insertEntity(User user);

    int updateByPrimaryKey(User user);

    int deleteByPrimaryKey(@Param("id") Long id);
}
