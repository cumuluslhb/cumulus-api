package com.cumulus.cumulus.mapper;

import com.cumulus.cumulus.entity.User;
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