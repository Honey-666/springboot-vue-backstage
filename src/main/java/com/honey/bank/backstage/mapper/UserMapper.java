package com.honey.bank.backstage.mapper;

import com.honey.bank.backstage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectByPrimaryKey(@Param("id") Long id);

    List<User> findAllPage(@Param("page") Integer page, @Param("size") Integer size,@Param("user") User user);

    int insertEntity(User user);

    int updateByPrimaryKey(User user);

    int deleteByPrimaryKey(@Param("id") Long id);

    @Select("select * from user where username=#{username} and password=#{password}")
    User findOneByUsernameAndPasswordUser(@Param("username")String username,@Param("password")String password);
}
