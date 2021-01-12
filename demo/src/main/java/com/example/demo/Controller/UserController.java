package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String getUser(Model model) {

        User u = userRepository.findUserById(1L);
        model.addAttribute("user", u);

        return "admin";
    }

    @PostMapping("/edit-user")
    public String editUser(@ModelAttribute("user") User user) {
        User u = userRepository.getOne(1L);
        u.setName(user.getName());
        u.setLastName(user.getLastName());
        u.setEmail(user.getEmail());
        u.setCity(user.getCity());
        u.setPhone(user.getPhone());
        u.setAbout(user.getAbout());
        u.setGithub(user.getGithub());
        u.setLinkedin(user.getLinkedin());
        u.setSkype(user.getSkype());
        userRepository.save(u);
        return "redirect:/admin";
    }
}
