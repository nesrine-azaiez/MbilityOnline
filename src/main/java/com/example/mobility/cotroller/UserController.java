
package com.example.mobility.cotroller;

import com.example.mobility.model.User;
import com.example.mobility.service.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @ApiOperation(value = "Retrieve User by ID ")
    @GetMapping("/retrieve-User-by-ID/{idU}")
    @ResponseBody
    public User RetrieveUser(@PathVariable("idU") Long idU)
    {
        return userService.retrieveUser(idU);
    }




    @ApiOperation(value = "update User By Id ")
    @PutMapping("/updateUserById/{idU}")
    @ResponseBody
    public void UpdateUser(@RequestBody User u, @PathVariable(name="idU") Long idUser)
    {
        userService.updateUser(u,idUser);
    }


    @ApiOperation(value = "delete User By Id ")
    @GetMapping("/deleteUserById/{idCom}")
    @ResponseBody
    public void DeleteUser(@PathVariable("idCom") Long idU)
    {
        userService.deleteUser(idU);

    }
}


