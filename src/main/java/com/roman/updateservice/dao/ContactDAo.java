package com.roman.updateservice.dao;

import com.roman.updateservice.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactDAo extends JpaRepository<Contact,Integer> {

    List<Contact> findAllByName(String name);

    @Query ("select c from Contact c where c.email=:email")
    Contact custtomRequestByEmail (String email);
}
