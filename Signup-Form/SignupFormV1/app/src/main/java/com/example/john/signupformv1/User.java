package com.example.john.signupformv1;

/**
 * Created by John on 4/8/2017.
 */

public class User {
    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;

    }
}
