
package com.example.mobility.service;


import com.example.mobility.model.User;

import java.util.List;

public interface IUserService {

    User addUser (User user);
    List<User> retrieveAllUsers();
    User retrieveUser (Long id);
    void updateUser(User u, Long idU);
    void deleteUser ( Long id);
}
