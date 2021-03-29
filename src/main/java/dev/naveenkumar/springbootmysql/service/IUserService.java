package dev.naveenkumar.springbootmysql.service;

import dev.naveenkumar.springbootmysql.model.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
