package com.nj.dao;

import com.nj.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Usermapper {
    List<User> getall();
}
