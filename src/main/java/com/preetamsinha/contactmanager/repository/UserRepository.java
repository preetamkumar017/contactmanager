package com.preetamsinha.contactmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.preetamsinha.contactmanager.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{


    @Query("SELECT u FROM Users u WHERE u.email = :email")
    public Users getUsersByUserName(@Param("email") String email);
}
