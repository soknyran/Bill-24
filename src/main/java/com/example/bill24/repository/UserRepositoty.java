package com.example.bill24.repository;

import com.example.bill24.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoty extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
