package com.example.model;

public class User {
        String username;
        String password;
        String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
