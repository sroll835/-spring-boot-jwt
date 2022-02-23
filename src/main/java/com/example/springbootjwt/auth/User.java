package com.example.springbootjwt.auth;

import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.swing.*;
import java.util.*;

public class User {
    private String passwordHash;
    private List<RoleEnum> roles;
    private String name;
    private String lastName;
    private String email;



    public User(UserDto userDto){
        this.passwordHash = BCrypt.hashpw(userDto.getPassword(), BCrypt.gensalt());
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public List<RoleEnum> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEnum> roles) {
        this.roles = roles;
    }

    public void update(UserDto user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.lastName = user.getLastName();
        if (user.getPassword() != null) {
            this.passwordHash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        }
    }
}
