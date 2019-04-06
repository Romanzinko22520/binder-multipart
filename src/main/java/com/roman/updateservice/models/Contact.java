package com.roman.updateservice.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"phonelist"})
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
       int id;
      String name;
       String email;


      @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "contact")
     List<Phone> phonelist = new ArrayList<>();

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
