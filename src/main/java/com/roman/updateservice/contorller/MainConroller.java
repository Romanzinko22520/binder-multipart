package com.roman.updateservice.contorller;

import com.roman.updateservice.models.Contact;
import com.roman.updateservice.models.Phone;
import com.roman.updateservice.services.ContactService;
import com.roman.updateservice.services.Phoneservice;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class MainConroller {

    private ContactService contactService;
    private Phoneservice phoneservice;
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("contacts",contactService.findAll());
        return "index";
    }


    @PostMapping("/saveContact")
    public String saveContact(Contact contact ,@RequestParam("phoneList" )String num){
        System.out.println(contact);
        System.out.println(contact.getPhonelist());
        contactService.save(contact);

        Phone phone = new Phone(num);
        phone.setContact(contact);
        phoneservice.save(phone);


        return "redirect:/";
        }
        
        @GetMapping("/details-{xxx}")
        public String contactDetails(@PathVariable ("xxx") int id, Model model){
            Contact one = contactService.getOne(id);
            model.addAttribute("contact",one);
            return "contactDetails";
        }
        
        @PostMapping("/update")
        public String updateContact(Contact contact){
        contactService.save(contact);
            return "redirect:/";
        }

}
