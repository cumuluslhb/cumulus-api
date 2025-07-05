package com.cumulus.cumulus.service;

import com.cumulus.cumulus.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    
    User getUserById(Long id);
    
    int createUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(Long id);
}    