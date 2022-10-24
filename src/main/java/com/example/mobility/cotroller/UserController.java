package com.example.mobility.cotroller;

import com.example.mobility.config.CurrentUser;
import com.example.mobility.dto.LocalUser;
import com.example.mobility.model.User;
import com.example.mobility.service.UserService;
import com.example.mobility.util.GeneralUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;


	///////////////////code ajouté/////////////////
	@ApiOperation(value = "retrieve All Users ")
	@GetMapping("/retrieve-All-Users")
	//@PreAuthorize("hasRole('ADMIN')")
	@ResponseBody
	public List<User> RetrieveAllUsers()
	{
		return  userService.retrieveAllUsers();
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

	@ApiOperation(value = "add User  ")
	@PostMapping("/addUser")
	@ResponseBody
	public void AddUser(User user)
	{
		userService.addUser(user);

	}
	///////////////////////////////////////

	@GetMapping("/user/me")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> getCurrentUser(@CurrentUser LocalUser user) {
		return ResponseEntity.ok(GeneralUtils.buildUserInfo(user));
	}

	@GetMapping("/all")
	public ResponseEntity<?> getContent() {
		return ResponseEntity.ok("Public content goes here");
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> getUserContent() {
		return ResponseEntity.ok("User content goes here");
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getAdminContent() {
		return ResponseEntity.ok("Admin content goes here");
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public ResponseEntity<?> getModeratorContent() {
		return ResponseEntity.ok("Moderator content goes here");
	}
}