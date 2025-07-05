package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectAll();
    
    User selectById(Long id);
    
    int insert(User user);
    
    int update(User user);
    
    int delete(Long id);
}    