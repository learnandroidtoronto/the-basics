package com.example.owner.signupformv1;

/**
 * Created by Owner on 4/8/2017.
 */

public class User {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String email, String password) {

        this.email = email;
        this.password = password;
    }
}
