package com.company.library.service;

import com.company.library.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    List<User> findAll();
    void save(User user);
    Optional<User> findById(Long userId);
    User findUserByEmail(String email);
}
