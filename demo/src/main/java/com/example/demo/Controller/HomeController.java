package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    protected final UserRepository userRepository;

    @GetMapping("/")
    public String getUser(Model model) {
        User u = userRepository.getOne(1L);
        model.addAttribute("user", u);
        return "home";
    }
}
