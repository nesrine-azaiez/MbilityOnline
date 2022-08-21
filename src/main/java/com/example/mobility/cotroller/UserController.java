
package com.example.mobility.cotroller;

import com.example.mobility.model.User;
import com.example.mobility.service.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "retrieve All Users ")
    @GetMapping("/retrieve-All-Users")
    @ResponseBody
    public List<User> RetrieveAllUsers()
    {
        return  userService.retrieveAllUsers();
    }

    @ApiOperation(value = "add User  ")
    @PostMapping("/addUser")
    @ResponseBody
    public void AddUser(User user)
    {
        userService.addUser(user);

    }

}


