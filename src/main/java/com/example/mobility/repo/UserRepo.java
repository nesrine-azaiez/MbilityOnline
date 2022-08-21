package com.example.mobility.repo;

import com.example.mobility.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository <User,Long> {
}
