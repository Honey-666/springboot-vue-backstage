package com.honey.bank.backstage.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User extends BaseEntity {
    private Integer id;
    private String username;
    private String password;
    private String salt;
}
