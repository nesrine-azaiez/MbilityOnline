package com.example.mobility.service;

import com.example.mobility.model.User;

import java.util.List;

public interface IUserService {

    User addUser (User user);
    List<User> retrieveAllUsers();

}
