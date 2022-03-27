package com.Book.BookStroe.controller;

import com.Book.BookStroe.domain.request.UserLoginDto;
import com.Book.BookStroe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/bookstore/login")
    public String userLoginForm(Model model){
        UserLoginDto userLoginDto = new UserLoginDto();
        model.addAttribute("user", userLoginDto);
        return "user-login";
    }
}
