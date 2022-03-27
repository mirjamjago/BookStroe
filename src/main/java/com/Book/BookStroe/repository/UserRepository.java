package com.Book.BookStroe.repository;

import com.Book.BookStroe.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByUserName(String userName);
}
