package com.honey.bank.backstage.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class BaseEntity {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_at;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date update_at;

    public BaseEntity() {
        super();
        Date date = new Date();
        this.create_at = date;
        this.update_at = date;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
