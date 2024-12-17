package com.jwt.example.services;


import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public List<User> getUser(){
        store.add(new User(UUID.randomUUID().toString(),"vithhal","vithhal@phandharpur.com"));
        return store;
    }
}
