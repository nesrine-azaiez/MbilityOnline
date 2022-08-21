package com.example.mobility.repo;

import com.example.mobility.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends CrudRepository<User,Long> {

}
