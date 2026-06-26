package org.example.lambdas.models;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String postCode;

    public Person(String firstName, String lastName, LocalDate dob, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.postCode = postCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
