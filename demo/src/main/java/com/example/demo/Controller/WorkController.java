package com.example.demo.Controller;

import com.example.demo.Model.Work;
import com.example.demo.Service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class WorkController {

    private final WorkService workService;

    @PostMapping("/edit-work/{id}")
    public String editWork(@PathVariable("id") long id, Work work) {
        workService.update(id, work);
        return "redirect:/admin";
    }

    @PostMapping("/work/{id_user}")
    public String addWork(@PathVariable("id_user") long user_id, Work work) {
        workService.add(user_id, work);
        return "redirect:/admin";
    }

    @GetMapping("/delete-work/{id}")
    public String removeWork(@PathVariable("id") long id) {
        workService.remove(id);
        return "redirect:/admin";
    }
}
