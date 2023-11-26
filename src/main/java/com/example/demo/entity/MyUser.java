package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("my_users")
public class MyUser {
    
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String phone;
    // private MyEnum enums;
    // private LocalDate date;
    // private LocalDateTime datetime;
    // @TableField("nickName")
    // private String nickName;

    public Integer getId(){
        return id;
    }

    public void setId(Integer value){
        this.id = value;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String value){
        this.name = value;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String value){
        this.phone = value;
    }

}
