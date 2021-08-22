package com.honey.bank.backstage.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@Accessors(chain = true)
public class BaseEntity {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date creat_at;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date update_at;

    public BaseEntity() {
        super();
        Date date = new Date();
        this.creat_at = date;
        this.update_at = date;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
