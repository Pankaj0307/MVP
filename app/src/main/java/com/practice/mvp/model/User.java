package com.practice.mvp.model;

/**
 * Created by: Pankaj on 24-04-2019
 */
public class User {
    private String fullName = "", email = "";

    public User() {
    }

    public User(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email : " + email + "\nFullName : " + fullName;
    }
}
