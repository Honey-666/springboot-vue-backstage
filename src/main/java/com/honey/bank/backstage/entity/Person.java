package com.honey.bank.backstage.entity;

import lombok.Data;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
public class Person extends BaseEntity{
    private Long id;
    private String name;
    private Integer age;
    private String profession;
    private String hobby;
    private Double salary;


}
