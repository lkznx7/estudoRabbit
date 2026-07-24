package com.clinly.estudorabbit;

import java.util.UUID;

public class user {

    UUID uuid = UUID.randomUUID();
    String name;
    String email;
    String password;

    public user() {}
    public user(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
