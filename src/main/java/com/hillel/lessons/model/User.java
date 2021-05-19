package com.hillel.lessons.model;

public class User extends Person {
    @Override
    public String getFirstname() {
        return super.getFirstname() + "test";
    }
}
