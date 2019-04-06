package com.roman.updateservice.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"phonelist"})
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String number;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     Contact contact;


    public Phone(String number) {
        this.number = number;
    }
}

