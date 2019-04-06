package com.roman.updateservice.services;

import com.roman.updateservice.dao.PhoneDAO;
import com.roman.updateservice.models.Phone;
import org.springframework.stereotype.Service;

@Service
public class Phoneservice {

    private PhoneDAO phoneDAO;

    public Phoneservice(PhoneDAO phoneDAO) {
        this.phoneDAO = phoneDAO;
    }

    public void save(Phone phone){
        phoneDAO.save(phone);
    }
}


