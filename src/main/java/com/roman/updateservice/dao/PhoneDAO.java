package com.roman.updateservice.dao;

import com.roman.updateservice.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDAO extends JpaRepository<Phone,Integer> {
}
