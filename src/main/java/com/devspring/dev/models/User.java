package com.devspring.dev.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity(name="Benutzer")
@Table(name= "users")
@ToString @EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private LocalDate birthday;




}
