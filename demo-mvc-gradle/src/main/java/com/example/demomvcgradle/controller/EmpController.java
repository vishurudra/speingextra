package com.example.demomvcgradle.controller;

import com.example.demomvcgradle.model.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Controller
public class EmpController {



    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", new ArrayList<>());
        return "index";
    }

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("user",new Emp());
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid Emp user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }


        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", new Emp());

        return "update-user";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Valid Emp user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setId(id);
            return "update-user";
        }



        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        Emp user = new  Emp();

        return "redirect:/index";
    }

}
