package com.Book.BookStroe.service;

import com.Book.BookStroe.domain.User;
import com.Book.BookStroe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User getUserByUserName(String username){return userRepository.getUserByUserName(username);
    }

}
