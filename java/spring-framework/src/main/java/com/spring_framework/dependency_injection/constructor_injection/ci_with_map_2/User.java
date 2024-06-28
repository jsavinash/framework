package com.spring_framework.dependency_injection.constructor_injection.ci_with_map_2;

public class User {
    private int id;
    private String name, email;

    public User() {
    }

    public User(int id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "Id:" + id + " Name:" + name + " Email Id:" + email;
    }
}