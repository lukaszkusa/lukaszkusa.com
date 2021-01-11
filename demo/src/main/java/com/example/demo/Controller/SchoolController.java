package com.example.demo.Controller;

import com.example.demo.Model.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kusa.portfolio.Service.SchoolService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class SchoolController {

    protected final SchoolService schoolService;


    @PutMapping("/edit-school/{id}")
    public String editSchool(@PathVariable("id") long id, School school) {
        schoolService.update(id, school);
        return "redirect:/admin";
    }
    @PostMapping("/school/{id_user}")
    public String addSchool(@PathVariable("id_user") long id, School school){
        schoolService.add(school, id);
        return "redirect:/admin";
    }
    @GetMapping("/delete-school/{id}")
    public String removeSchool(@PathVariable("id") long id){
        schoolService.remove(id);
        return "redirect:/admin";
    }
}
