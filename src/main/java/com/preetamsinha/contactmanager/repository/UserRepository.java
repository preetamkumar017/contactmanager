package com.preetamsinha.contactmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preetamsinha.contactmanager.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
