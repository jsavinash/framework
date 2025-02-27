package com.spring_framework.dependency_injection.constructor_injection.ci_dependent_object;

public class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString() {
        return city + " " + state + " " + country;
    }
}