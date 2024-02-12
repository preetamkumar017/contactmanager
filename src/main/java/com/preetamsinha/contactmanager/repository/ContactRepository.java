package com.preetamsinha.contactmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preetamsinha.contactmanager.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
