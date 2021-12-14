package com.honey.bank.backstage.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;
@Data
public class BaseEntity {
    @TableField(exist = false)
    @JsonIgnore
    private Integer pageNumber = 1;
    @TableField(exist = false)//数据库忽略该字段
    @JsonIgnore//展示忽略该字段
    private Integer size = 10;

    //展示日期格式化
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateAt;
}
