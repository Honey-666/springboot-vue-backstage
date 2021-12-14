package com.honey.bank.backstage.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author bank
 * @since 2021-12-11
 */
@Data
@TableName("person")
public class Person extends BaseEntity{

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职业
     */
    private String profession;

    /**
     * 兴趣
     */
    private String hobby;

    /**
     * 薪资
     */
    private BigDecimal salary;

}
