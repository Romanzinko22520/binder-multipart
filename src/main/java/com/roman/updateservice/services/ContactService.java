package com.roman.updateservice.services;

import com.roman.updateservice.dao.ContactDAo;
import com.roman.updateservice.models.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private ContactDAo contactDAo;

    public ContactService(ContactDAo contactDAo) {
        this.contactDAo = contactDAo;
    }

    public void save(Contact contact) {
        if (contact != null) {
            contactDAo.save(contact);
        }
    }

    public List<Contact> findAllByName(String name) {
        if (name.isEmpty()) {
            return contactDAo.findAllByName(name);
        }
        return null;

    }
    public List<Contact> findAll(){
           return contactDAo.findAll();
    }

    public Contact getOne(int id){
        return contactDAo.getOne(id);

    }
}
//несе в собі б ізнес логіку,рівень перевірок