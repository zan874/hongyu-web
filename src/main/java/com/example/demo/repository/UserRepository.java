package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.MyUser;

@Repository
public interface UserRepository extends BaseMapper<MyUser> {
}