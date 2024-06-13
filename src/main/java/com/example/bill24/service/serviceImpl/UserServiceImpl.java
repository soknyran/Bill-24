package com.example.bill24.service.serviceImpl;

import com.example.bill24.model.entity.User;
import com.example.bill24.repository.UserRepositoty;
import com.example.bill24.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoty userRepositoty;

    public UserServiceImpl(UserRepositoty userRepositoty) {
        this.userRepositoty = userRepositoty;
    }

    @Override
    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        userRepositoty.findAll().forEach(users::add);
        return users;
    }
}
