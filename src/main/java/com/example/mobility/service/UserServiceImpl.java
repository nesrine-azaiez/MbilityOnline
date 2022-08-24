
package com.example.mobility.service;

import com.example.mobility.model.User;
import com.example.mobility.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepo userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> retrieveAllUsers() {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> {
            users.add(user);
        });
        return users;
    }

    @Override
    public User retrieveUser(Long id) {
        User u = userRepository.findById(id).orElse(null);
        return u;
    }

    @Override
    public void updateUser(User u, Long idU) {
        User user=userRepository.findById(idU).orElse(null);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
