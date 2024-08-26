package com.javaexample.jwt.api.repository;

import com.javaexample.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String userName);
}
