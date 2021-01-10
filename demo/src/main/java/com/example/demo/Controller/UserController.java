package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/user")
    @ResponseBody
    public Iterable<User> getUser(){
        return userRepository.findAll();
    }
}
