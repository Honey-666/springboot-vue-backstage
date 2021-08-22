package com.honey.bank.backstage.mapper;

import com.honey.bank.backstage.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {

    Person selectByPrimaryKey(@Param("id") Long id);

    List<Person> findAllPage(@Param("beginSize") Integer beginSize, @Param("size") Integer size,@Param("person") Person person);

    int insertEntity(Person person);

    int updateByPrimaryKey(Person person);

    int deleteByPrimaryKey(@Param("id") Long id);
}
