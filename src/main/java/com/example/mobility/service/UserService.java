package com.example.mobility.service;

import com.example.mobility.dto.LocalUser;
import com.example.mobility.dto.SignUpRequest;
import com.example.mobility.exception.UserAlreadyExistAuthenticationException;
import com.example.mobility.model.User;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import java.util.List;
import java.util.Map;
import java.util.Optional;


/////////////////////////
public interface UserService {

	User addUser (User user);

	void updateUser(User u, Long idU);

	User retrieveUser (Long id);

	List<User> retrieveAllUsers();

	void deleteUser ( Long id);
	/////////////////////////////

	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
